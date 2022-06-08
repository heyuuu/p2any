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

    protected $typeBlackList = [
        // 'NameRelative',
        // 'NameFullyQualified',
        // 'VarLikeIdentifier',
    ];

    private $classes      = null;
    private $baseClassMap = null;
    /** @var ClassInfo[]|null */
    private $types = [];

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
        $classInfo->type        = TypeUtil::mapType($class);
        $classInfo->isInterface = $refClass->isInterface() || $this->isMapToInterface($classInfo->type);
        $classInfo->isAbstract  = $refClass->isAbstract();
        $classInfo->parents     = collect(array_merge(
            $refClass->getParentClass() ? [$refClass->getParentClass()->getName()] : [],
            $refClass->getInterfaceNames()
        ))
            ->map(function (string $parentName) {
                return TypeUtil::mapType($parentName);
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

    protected function isMapToInterface(string $type): bool
    {
        return in_array($type, ['Stmt', 'Expr', 'Scalar']);
    }

    protected function guessType(ReflectionProperty $property): TypeInfo
    {
        // 从 DocComment 的 @var 注释推断类型
        $docComment = $property->getDocComment();
        if (preg_match('/@var ([^ ]+)/', $docComment, $matches)) {
            $typeDesc = $matches[1];
            return $this->mapTypesDesc($typeDesc);
        }

        // 从名称推断类型
        $name = $property->name;

        if ($name === 'expr') {
            return TypeInfo::simple('Expr');
        } elseif ($name === 'stmts') {
            return TypeInfo::list(TypeInfo::simple('Stmt'));
        }

        return TypeInfo::simple('Any', '?');
    }

    protected function mapTypeDesc(string $type): TypeInfo
    {
        if (Str::endsWith($type, '[]')) {
            return TypeInfo::list($this->mapTypesDesc(substr($type, 0, -2)));
        } elseif (preg_match("/array<(.*)>/", $type, $matches)) {
            return TypeInfo::list($this->mapTypesDesc($matches[1]));
        }

        $baseType = Str::afterLast($type, "\\");

        // 写死的匹配
        $map = [
            'int'               => TypeInfo::simple('Int'),
            'float'             => TypeInfo::simple('Double'),
            'bool'              => TypeInfo::simple('Boolean'),
            'string'            => TypeInfo::simple('String'),
            'array'             => TypeInfo::list(TypeInfo::simple('Any')),
            'Const_'            => TypeInfo::simple('Const'),
            'Class_'            => TypeInfo::simple('StmtClass'),
            'VarLikeIdentifier' => TypeInfo::simple('Identifier'),
        ];
        if (isset($map[$baseType])) {
            return $map[$baseType];
        }

        // baseName 匹配
        $baseClassMap = $this->getBaseClassMap();
        $classes      = $baseClassMap[$baseType] ?? [];
        if (count($classes) == 1) {
            return TypeInfo::simple(TypeUtil::mapType($classes[0]));
        } elseif (count($classes) > 1) {
            throw new Exception(sprintf('基础类型对应多个类，需特殊处理: base=%s, classes=%s', $baseType, join('|', $classes)));
        }

        // 没匹配上的情况
        throw new Exception("未匹配上类型注释: " . $type);
    }

    private function mapTypesDesc(string $type): TypeInfo
    {
        if ($type === '(ArrayItem|null)[]') {
            return TypeInfo::list(TypeInfo::simple('ExprArrayItem', true));
        }
        if (false !== strpos($type, '(')) {
            throw new Exception("不支持类型标注带括号的情况");
        }

        $subTypes = explode('|', $type);
        $nullable = in_array('null', $subTypes);

        /** @var TypeInfo[] $mapSubTypes */
        $mapSubTypes = collect($subTypes)
            ->map(function ($subType) {
                return in_array($subType, ['null', 'Error']) ? null : $this->mapTypeDesc($subType);
            })
            ->unique()
            ->filter()
            ->values()
            ->all();

        switch (count($mapSubTypes)) {
            case 0:
                throw new Exception("类型映射为空: " . $type);
            case 1:
                return $mapSubTypes[0]->withNullable($nullable);
                return TypeInfo::simple($mapSubTypes[0], $nullable);
            default:
                return TypeInfo::anyOf($mapSubTypes, $nullable);
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