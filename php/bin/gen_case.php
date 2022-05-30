<?php

use P2Any\Utils\FileUtil;
use P2Any\Utils\ParserUtil;
use P2Any\Utils\PhpFileFinder;

require_once __DIR__ . '/../vendor/autoload.php';

$srcRoot = __DIR__ . '/../src/PhpParser/';
$dstRoot = __DIR__ . '/../../runtime/ast_by_php/';

$finder = new PhpFileFinder($srcRoot);
/** @var \Symfony\Component\Finder\SplFileInfo $file */
foreach ($finder as $file) {
    printf("Handle file: %s\n", $file->getRelativePathname());
    $dstFile = $dstRoot . str_replace('.php', '.json', $file->getRelativePathname());
    $ast     = ParserUtil::parse($file->getContents(), true);
    FileUtil::saveJsonFile($dstFile, $ast);
}
