<?php

use P2Any\Utils\FileUtil;
use P2AnyScript\AbstractAstGenTask;
use P2AnyScript\ClassInfo;
use P2AnyScript\TypeInfo;
use Webmozart\Assert\Assert;

require_once __DIR__ . '/../vendor/autoload.php';

class GenAstTransformerTask extends AbstractAstGenTask
{
    protected $dstFile = self::ROOT . '/src/main/java/php/parser/AstTransformer.kt';

    public function run()
    {
        $types = $this->getTypes();
        ksort($types);

        // 入口方法
        $enterFunc = $this->renderEnterFunc($types);

        // 类结束
        $typesFunc = $this->renderTypesFunc($types);

        // code
        $code = <<<CODE
package php.parser

import php.parser.node.*

class AstTransformer : AstTransformerAbstract() {
{$enterFunc}

{$typesFunc}
}
CODE;

        // echo $code;
        FileUtil::saveFile($this->dstFile, $code);
    }

    /**
     * @param ClassInfo[] $types
     * @return string
     */
    protected function renderEnterFunc(array $types): string
    {
        $lines   = [];
        $lines[] = <<<'CODE'
    override fun p(node: Node): php.ast.Node {
        return when (node) {
CODE;

        foreach ($types as $type => $classInfo) {
            if (!$classInfo->isInterface && !$classInfo->isAbstract) {
                $lines[] = <<<CASE
            is {$type} -> p{$type}(node)
CASE;
            }
        }
        $lines[] = <<<'CODE'
            else -> throw Exception("预期外的 Node 类型: ${node::class.qualifiedName}")
        }
    }
CODE;
        return join(PHP_EOL, $lines);
    }

    /**
     * @param ClassInfo[] $types
     * @return string
     */
    protected function renderTypesFunc(array $types): string
    {
        $lines = [];
        foreach ($types as $type => $classInfo) {
            if ($classInfo->isInterface || $classInfo->isAbstract) {
                continue;
            }

            $lines[] = <<<START
    private fun p{$type}(node: {$type}): php.ast.{$type} {
START;
            /** @var $typeInfo TypeInfo */
            foreach ($classInfo->properties as $property => $typeInfo) {
                Assert::isInstanceOf($typeInfo, TypeInfo::class);

                $indent  = "        ";
                $varName = $this->wrapVarName($property);
                $lines[] = $indent . sprintf('val %s = node.%s', $varName, $varName);
            }

            $lines[] = <<<NEW

        return php.ast.{$type}(
NEW;

            /** @var $typeInfo TypeInfo */
            foreach ($classInfo->properties as $property => $typeInfo) {
                Assert::isInstanceOf($typeInfo, TypeInfo::class);

                $indent       = "            ";
                $varName      = $this->wrapVarName($property);
                $methodSuffix = ($typeInfo->isNullable() ? 'OrNull' : '');

                // $lines[] = $indent . sprintf('%s = p(%s, php.ast.%s::class),', $varName, $varName, $typeInfo);

                switch ($typeInfo->getType()) {
                    case TypeInfo::TYPE_SIMPLE:
                        $method = 'p' . $methodSuffix;
                        if ($this->isBaseType($typeInfo->getTypeName())) {
                            $lines[] = $indent . sprintf('%s = %s,', $varName, $varName);
                        } else {
                            $lines[] = $indent . sprintf('%s = %s(%s, %s::class),', $varName, $method, $varName, $this->newType($typeInfo->getTypeName()));
                        }
                        break;
                    case TypeInfo::TYPE_LIST:
                        $itemType = $typeInfo->getItemType();
                        $method   = 'pList' . ($itemType->isNullable() ? 'OfNullable' : '') . $methodSuffix;
                        $lines[]  = $indent . sprintf('%s = %s(%s, %s::class),', $varName, $method, $varName, $this->newType($itemType->toTypeHintNotNull()));
                        break;
                    case TypeInfo::TYPE_ANY_OF:
                        $method  = 'pAnyOf' . count($typeInfo->getAnyTypes()) . $methodSuffix;
                        $lines[] = $indent . sprintf('%s = %s(%s, %s),', $varName, $method, $varName,
                                collect($typeInfo->getAnyTypes())->map(function (TypeInfo $type) {
                                    return $this->newType($type->toTypeHint()) . '::class';
                                })->join(', ')
                            );
                        break;
                }
            }

            $lines[] = <<<END
        )
    }
END;
        }

        return join(PHP_EOL, $lines);
    }

    private function isBaseType(string $type)
    {
        return in_array($type, ['Boolean', 'Int', 'Double', 'String', 'Any']);
    }

    private function newType(string $type)
    {
        return $this->isBaseType($type) ? $type : "php.ast." . $type;
    }
}

(new GenAstTransformerTask())->run();
