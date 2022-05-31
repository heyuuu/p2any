<?php

namespace P2Any;

use PHPUnit\Framework\TestCase;
use Psr\Log\AbstractLogger;

class IrCompilerTest extends TestCase
{
    const ROOT = __DIR__ . '/../../';

    public function testBase()
    {
        $srcRoot = self::ROOT . '/runtime/ir_compiler/src/';
        $dstRoot = self::ROOT . '/runtime/ir_compiler/dst/';
        $this->runCompileDir($srcRoot, $dstRoot);
    }

    public function testPhpParser()
    {
        $srcRoot = self::ROOT . '/php/src/PhpParser/';
        $dstRoot = self::ROOT . '/runtime/ir_by_php/';
        $this->runCompileDir($srcRoot, $dstRoot);
    }

    private function runCompileDir(string $srcRoot, string $dstRoot)
    {
        $irCompiler = new IrCompiler();
        $irCompiler->setLogger(new class extends AbstractLogger {
            public function log($level, $message, array $context = [])
            {
                printf("[%s] %s\n", strtoupper($level), $message);
            }
        });

        $irCompiler->compileDir($srcRoot, $dstRoot);

        self::assertTrue(true);
    }

}
