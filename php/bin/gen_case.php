<?php

use P2Any\Utils\FileUtil;
use P2Any\Utils\ParserUtil;
use P2Any\Utils\PhpFileFinder;
use P2AnyScript\NoCommentPrinter;
use P2AnyScript\NodeJsonEncoder;

require_once __DIR__ . '/../vendor/autoload.php';

$srcRoot   = __DIR__ . '/../src/PhpParser/';
$nodeRoot  = __DIR__ . '/../../runtime/case_php/node_json/';
$printRoot = __DIR__ . '/../../runtime/case_php/node_print/';

$printer = new NoCommentPrinter();
$finder = new PhpFileFinder($srcRoot);
/** @var \Symfony\Component\Finder\SplFileInfo $file */
foreach ($finder as $file) {
    printf("Handle file: %s\n", $file->getRelativePathname());

    $nodeFile = $nodeRoot . str_replace('.php', '.json', $file->getRelativePathname());
    $ast      = ParserUtil::parse($file->getContents(), true);
    FileUtil::saveFile($nodeFile, NodeJsonEncoder::encode($ast));

    $printFile = $printRoot . $file->getRelativePathname();
    $code      = $printer->prettyPrintFile($ast);
    FileUtil::saveFile($printFile, $code);
}
