<?php

use P2Any\Utils\FileUtil;
use P2AnyScript\AbstractAstGenTask;
use P2AnyScript\ClassInfo;
use P2AnyScript\TypeInfo;
use Webmozart\Assert\Assert;

require_once __DIR__ . '/../vendor/autoload.php';

class GenAstPrinterTask extends AbstractAstGenTask
{
    protected $dstFile = self::ROOT . '/src/main/java/php/parser/NodePrinter.kt';

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

class NodePrinter : NodePrinterAbstract() {
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
    override fun p(node: Node): String {
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
    private fun p{$type}(node: {$type}): String {
START;
            /** @var $type TypeInfo */
            foreach ($classInfo->properties as $property => $type) {
                Assert::isInstanceOf($type, TypeInfo::class);

                $indent  = "        ";
                $varName = $this->wrapVarName($property);
                $lines[] = $indent . sprintf('val %s = node.%s', $varName, $varName);
            }

            $lines[] = <<<END

        TODO()
    }
END;
        }

        return join(PHP_EOL, $lines);
    }
}

(new GenAstPrinterTask())->run();
