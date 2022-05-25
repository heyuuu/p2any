<?php

use P2Any\Service\NodeTransformerGenerate;
use P2Any\Utils\FileUtil;
use P2Any\Utils\ParserUtil;
use P2Any\Utils\PhpFileFinder;

require_once __DIR__ . '/../vendor/autoload.php';

require_once __DIR__ . '/gen_node_transformer.php';

$srcRoot = __DIR__ . '/../src/PhpParser/';
$dstRoot = __DIR__ . '/../../runtime/fragment/';

$finder      = new PhpFileFinder($srcRoot);
$transformer = new NodeTransformerGenerate();
/** @var \Symfony\Component\Finder\SplFileInfo $file */
foreach ($finder as $file) {
    printf("Handle file: %s\n", $file->getRelativePathname());
    $dstFile   = $dstRoot . $file->getRelativePathname();
    $ast       = ParserUtil::parse($file->getContents(), true);
    $fragments = $transformer->visitList($ast);

    FileUtil::saveJsonFile($dstFile, $fragments);
}
