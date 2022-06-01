<?php

namespace P2AnyScript;

use Exception;
use Illuminate\Support\Str;
use P2Any\PhpParser\Node;
use P2Any\PhpParser\NodeAbstract;
use P2Any\Utils\PhpFileFinder;
use ReflectionClass;
use ReflectionProperty;
use Symfony\Component\Finder\SplFileInfo;

abstract class AbstractAstGenTask
{
    const ROOT = __DIR__ . '/../../../';
    protected $nodeRoot = self::ROOT . '/php/src/PhpParser/Node/';
    protected $nsPrefix = 'P2Any\\PhpParser\\Node\\';
    protected $dstFile  = self::ROOT . '/src/main/java/php/parser/node/generate.kt';

    protected $typeBlackList = [
        'NameRelative',
        'NameFullyQualified',
        'VarLikeIdentifier',
    ];
    /**
     * @var array
     */
    protected $collect = [];

    private $classes      = null;
    private $baseClassMap = null;
    private $types        = null;

    protected function getClasses(): array
    {
        if (!$this->classes) {
            $finder        = new PhpFileFinder($this->nodeRoot);
            $this->classes = collect($finder)
                ->map(function (SplFileInfo $fileInfo) {
                    $class = $this->nsPrefix . str_replace(['/', '.php'], ['\\', ''], $fileInfo->getRelativePathname());
                    return class_exists($class) ? $class : null;
                })
                ->filter()
                ->values()
                ->all();
        }
        return $this->classes;
    }

    protected function getBaseClassMap(): array
    {
        if (!$this->baseClassMap) {
            $baseClassMap = [];
            foreach ($this->getClasses() as $class) {
                $baseClassMap[class_basename($class)][] = $class;
            }
            $this->baseClassMap = $baseClassMap;
        }
        return $this->baseClassMap;
    }

    /**
     * @return ClassInfo[]
     */
    protected function getTypes(): array
    {
        if (!$this->types) {
            $this->types = collect($this->getClasses())
                ->mapWithKeys(function (string $class) {
                    $classInfo = $this->parseClassInfo($class);
                    if (in_array($classInfo->type, $this->typeBlackList)) {
                        return [];
                    } else {
                        return [$classInfo->type => $classInfo];
                    }
                })
                ->all();
        }
        return $this->types;
    }

    protected function parseClassInfo(string $class): ClassInfo
    {
        $refClass = new ReflectionClass($class);

        $classInfo              = new ClassInfo();
        $classInfo->class       = $class;
        $classInfo->type        = $this->mapType($class);
        $classInfo->isInterface = $refClass->isInterface() || $this->isMapToInterface($classInfo->type);
        $classInfo->isAbstract  = $refClass->isAbstract();
        $classInfo->parents     = collect(array_merge(
            $refClass->getParentClass() ? [$refClass->getParentClass()->getName()] : [],
            $refClass->getInterfaceNames()
        ))
            ->map(function (string $parentName) {
                return $this->mapType($parentName);
            })
            ->filter()
            ->unique()
            ->values()
            ->all();
        $classInfo->properties  = collect($refClass->getProperties())
            ->filter(function (ReflectionProperty $property) {
                return !$property->isStatic() && $property->name !== 'attributes';
            })
            ->mapWithKeys(function (ReflectionProperty $property) {
                return [
                    $property->name => $this->guessType($property),
                ];
            })
            ->all();

        return $classInfo;
    }

    protected function mapType(string $class)
    {
        if ($class === Node::class || $class === NodeAbstract::class) {
            return 'Node';
        } elseif (Str::startsWith($class, $this->nsPrefix)) {
            return str_replace(['\\', '_'], '', Str::after($class, $this->nsPrefix));
        } else {
            return null;
        }
    }

    protected function isMapToInterface(string $type): bool
    {
        return in_array($type, ['Stmt', 'Expr', 'Scalar']);
    }

    protected function guessType(ReflectionProperty $property): string
    {
        // 从 DocComment 的 @var 注释推断类型
        $docComment = $property->getDocComment();
        if (preg_match('/@var ([^ ]+)/', $docComment, $matches)) {
            $typeDesc        = $matches[1];
            $type            = $this->mapTypesDesc($typeDesc);
            $this->collect[] = $typeDesc . "\t=> " . $type;
            return $type;
        }

        // 从名称推断类型
        $name = $property->name;

        if ($name === 'expr') {
            return 'Expr';
        } elseif ($name === 'stmts') {
            return 'List<Stmt>';
        }

        return 'Any?';
    }

    protected function mapTypeDesc(string $type): string
    {
        if (Str::endsWith($type, '[]')) {
            return 'List<' . $this->mapTypesDesc(substr($type, 0, -2)) . '>';
        } elseif (preg_match("/array<(.*)>/", $type, $matches)) {
            return 'List<' . $this->mapTypesDesc($matches[1]) . '>';
        }

        $baseType = Str::afterLast($type, "\\");

        // 写死的匹配
        $map = [
            'int'               => 'Int',
            'float'             => 'Double',
            'bool'              => 'Boolean',
            'string'            => 'String',
            'array'             => 'List<Any>',
            'Const_'            => 'Const',
            'Class_'            => 'StmtClass',
            'VarLikeIdentifier' => 'Identifier',
        ];
        if (isset($map[$baseType])) {
            return $map[$baseType];
        }

        // baseName 匹配
        $baseClassMap = $this->getBaseClassMap();
        $classes      = $baseClassMap[$baseType] ?? [];
        if (count($classes) == 1) {
            return $this->mapType($classes[0]);
        } elseif (count($classes) > 1) {
            throw new Exception(sprintf('基础类型对应多个类，需特殊处理: base=%s, classes=%s', $baseType, join('|', $classes)));
        }

        // 没匹配上的情况
        throw new Exception("未匹配上类型注释: " . $type);
    }

    private function mapTypesDesc(string $type): string
    {
        if ($type === '(ArrayItem|null)[]') {
            return 'List<ExprArrayItem?>';
        }
        if (false !== strpos($type, '(')) {
            throw new Exception("不支持类型标注带括号的情况");
        }

        $subTypes = explode('|', $type);
        $nullable = in_array('null', $subTypes);

        $mapSubTypes = collect($subTypes)
            ->map(function ($subType) {
                return in_array($subType, ['null', 'Error']) ? null : $this->mapTypeDesc($subType);
            })
            ->unique()
            ->filter()
            ->values()
            ->all();

        $nullableSuffix = $nullable ? '?' : '';
        switch (count($mapSubTypes)) {
            case 0:
                throw new Exception("类型映射为空: " . $type);
            case 1:
                return $mapSubTypes[0] . $nullableSuffix;
            case 2:
                return sprintf("OneOf2<%s>", join(', ', $mapSubTypes)) . $nullableSuffix;
            case 3:
                return sprintf("OneOf3<%s>", join(', ', $mapSubTypes)) . $nullableSuffix;
            default:
                throw new Exception("类型枚举过多: " . join(', ', $mapSubTypes));
        }
    }

    protected function wrapVarName(string $name): string
    {
        if (in_array($name, ['var', 'class', 'else', 'if'])) {
            $name = '`' . $name . '`';
        }
        return $name;
    }
}