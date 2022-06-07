<?php

use P2Any\Utils\FileUtil;
use P2AnyScript\AbstractAstGenTask;
use P2AnyScript\ClassInfo;
use P2AnyScript\TypeInfo;
use Webmozart\Assert\Assert;

require_once __DIR__ . '/../vendor/autoload.php';

class GenAstDecodeTask extends AbstractAstGenTask
{
    protected $dstFile = self::ROOT . '/src/main/java/php/parser/NodeDecoder.kt';

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

class NodeDecoder : NodeDecoderAbstract() {
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
    override fun tryResolveNode(nodeType: String, properties: ValueMap): Node? {
        return when (nodeType) {
CODE;

        foreach ($types as $type => $classInfo) {
            if (!$classInfo->isInterface && !$classInfo->isAbstract) {
                $lines[] = <<<CASE
            "{$type}" -> decode{$type}(properties)
CASE;
            }
        }
        $lines[] = <<<'CODE'
            else -> null
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
    private fun decode{$type}(properties: ValueMap): {$type} {
        return {$type}(
START;
            /** @var $type TypeInfo */
            foreach ($classInfo->properties as $property => $type) {
                Assert::isInstanceOf($type, TypeInfo::class);

                // todo
                $indent       = "            ";
                $varName      = $this->wrapVarName($property);
                $methodSuffix = ($type->isNullable() ? 'OrNull' : '');

                switch ($type->getType()) {
                    case TypeInfo::TYPE_SIMPLE:
                        $method  = 'getAs' . $methodSuffix;
                        $lines[] = $indent . sprintf('%s = properties.%s("%s", %s::class),', $varName, $method, $property, $type->getTypeName());
                        break;
                    case TypeInfo::TYPE_LIST:
                        $itemType = $type->getItemType();
                        $method   = 'getAsList' . ($itemType->isNullable() ? 'OfNullable' : '') . $methodSuffix;
                        $lines[]  = $indent . sprintf('%s = properties.%s("%s", %s::class),', $varName, $method, $property, $itemType->toTypeHintNotNull());
                        break;
                    case TypeInfo::TYPE_ANY_OF:
                        $method  = 'getAsAnyOf' . count($type->getAnyTypes()) . $methodSuffix;
                        $lines[] = $indent . sprintf('%s = properties.%s("%s", %s),', $varName, $method, $property,
                                collect($type->getAnyTypes())->map(function (TypeInfo $type) {
                                    return $type->toTypeHint() . '::class';
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
}

(new GenAstDecodeTask())->run();
