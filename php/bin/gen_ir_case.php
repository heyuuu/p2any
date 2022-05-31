<?php

use P2Any\IrCompiler;
use Psr\Log\AbstractLogger;

require_once __DIR__ . '/../vendor/autoload.php';

$srcRoot = __DIR__ . '/../src/PhpParser/';
$dstRoot = __DIR__ . '/../../runtime/ir_by_php/';

$irCompiler = new IrCompiler();
$irCompiler->setLogger(new class extends AbstractLogger {
    public function log($level, $message, array $context = [])
    {
        printf("[%s] %s\n", strtoupper($level), $message);
    }
});

$irCompiler->compileDir($srcRoot, $dstRoot);
