<?php

use P2Any\PhpParser\Node;
use P2Any\Utils\FileUtil;
use P2Any\Utils\PhpFileFinder;
use Symfony\Component\Finder\SplFileInfo;

require_once __DIR__ . '/../vendor/autoload.php';

$nodeRoot = __DIR__ . '/../src/PhpParser/Node/';
$nsPrefix = 'P2Any\\PhpParser\\Node\\';
$tplFile  = __DIR__ . '/tpl/NodeTransformer.php';
$dstFile  = __DIR__ . '/../src/Service/NodeTransformerGenerate.php';

$finder  = new PhpFileFinder($nodeRoot);
$classes = collect($finder)
    ->map(function (SplFileInfo $fileInfo) use ($nsPrefix) {
        $class = $nsPrefix . str_replace(['/', '.php'], ['\\', ''], $fileInfo->getRelativePathname());
        if (!class_exists($class)) {
            return null;
        }

        $refClass = new ReflectionClass($class);
        if ($refClass->isInterface() || $refClass->isTrait() || $refClass->isAbstract()) {
            return null;
        }

        return $class;
    })
    ->filter()
    ->sort()
    ->values()
    ->all();

// echo join(PHP_EOL, $classes);

// 生成代码
$types = [];
foreach ($classes as $class) {
    $methodName   = 'visit' . str_replace([$nsPrefix, '\\'], '', $class);
    $paramType    = str_replace($nsPrefix, 'Node\\', $class);
    $fragmentType = 'Fragment';
    if (is_subclass_of($class, Node\Stmt::class)) {
        $fragmentType .= '\\Stmt';
    } elseif (is_subclass_of($class, Node\Expr::class)) {
        $fragmentType .= '\\Expr';
    }

    $types[] = [$methodName, $paramType, $fragmentType];
}

ob_start();
include $tplFile;
$code = ob_get_clean();

FileUtil::saveFile($dstFile, $code);
