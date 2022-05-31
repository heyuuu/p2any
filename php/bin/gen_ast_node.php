<?php

use Illuminate\Support\Str;
use P2Any\Utils\FileUtil;
use P2Any\Utils\PhpFileFinder;
use Symfony\Component\Finder\SplFileInfo;

require_once __DIR__ . '/../vendor/autoload.php';

$nodeRoot = __DIR__ . '/../src/PhpParser/Node/';
$nsPrefix = 'P2Any\\PhpParser\\Node\\';
$dstFile  = __DIR__ . '/../../src/main/java/php/ast/generate.kt';

ob_start();
echo "package php.ast\n\n";
$finder  = new PhpFileFinder($nodeRoot);
$classes = collect($finder)
    ->each(function (SplFileInfo $fileInfo) use ($nsPrefix) {
        $class = $nsPrefix . str_replace(['/', '.php'], ['\\', ''], $fileInfo->getRelativePathname());
        if (!class_exists($class)) {
            return null;
        }

        $refClass = new ReflectionClass($class);

        $className   = mapType($refClass->getName());
        $isInterface = $refClass->isInterface() || mapToInterface($className);

        $superClassName      = null;
        $superInterfaceNames = [];
        if ($refClass->getParentClass()) {
            $tempSuperClass = mapType($refClass->getParentClass()->getName());
            if (mapToInterface($tempSuperClass)) {
                $superClass = $tempSuperClass;
            } else {
                $superInterfaceNames[] = $tempSuperClass;
            }
        }
        $superInterfaceNames = array_merge(
            $superInterfaceNames,
            collect($refClass->getInterfaceNames())->map('mapType')->filter()->all()
        );

        $properties = collect($refClass->getProperties())
            ->filter(function (ReflectionProperty $property) {
                return !$property->isStatic() && !in_array($property->name, ['attributes']);
            })
            ->map(function (ReflectionProperty $property) {
                $name = $property->name;
                if (in_array($name, ['var', 'class', 'else'])) {
                    $name = '`' . $name . '`';
                }
                return 'val ' . $name . ' :' . guessPropertyType($property->name);
            })
            ->join(', ');

        if ($isInterface) {
            printf("interface %s: %s", $className, join(', ', $superInterfaceNames));
        } else {
            printf(
                "%s class %s(%s): %s%s",
                $refClass->isAbstract() ? "abstract" : "data",
                $className,
                $properties,
                $superClassName ? $superClassName . '(), ' : '',
                join(', ', $superInterfaceNames)
            );
        }
        echo PHP_EOL;
    });
$code    = ob_get_clean();
echo $dstFile;
FileUtil::saveFile($dstFile, $code);

function mapType(string $class)
{
    global $nsPrefix;
    if ($class === 'P2Any\PhpParser\Node' || $class === 'P2Any\PhpParser\NodeAbstract') {
        return 'AstNode';
    } elseif (Str::startsWith($class, $nsPrefix)) {
        return str_replace(
            ['\\', '_'],
            '',
            Str::after($class, $nsPrefix)
        );
    } else {
        return null;
    }
}

function guessPropertyType(string $name)
{
    if ($name === 'expr') {
        return 'Expr';
    } elseif ($name === 'stmts') {
        return 'List<Stmt>';
    }

    return 'Any?';
}

function mapToInterface(string $newClass)
{
    return in_array($newClass, ['Stmt', 'Expr', 'Scalar']);
}