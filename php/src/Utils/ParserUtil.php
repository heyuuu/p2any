<?php

namespace P2Any\Utils;

use P2Any\PhpParser\NodeTraverser;
use P2Any\PhpParser\NodeVisitor;
use P2Any\PhpParser\NodeVisitor\NameResolver;
use P2Any\PhpParser\Parser;
use P2Any\PhpParser\ParserFactory;
use P2Any\PhpParser\PrettyPrinter\Standard;

class ParserUtil
{
    public static function newParser(): Parser
    {
        return (new ParserFactory())->create(ParserFactory::ONLY_PHP7);
    }

    public static function parse(string $code, bool $nameResolved = false)
    {
        $ast = self::newParser()->parse($code);
        if ($nameResolved) {
            $ast = self::nameResolve($ast);
        }
        return $ast;
    }

    public static function nameResolve(array $ast): array
    {
        return self::traverseByVisitor($ast, new NameResolver());
    }

    public static function traverseByVisitor(array $ast, NodeVisitor $nodeVisitor): array
    {
        $nodeTraverser = new NodeTraverser();
        $nodeTraverser->addVisitor($nodeVisitor);
        return $nodeTraverser->traverse($ast);
    }

    public static function prettyPrint(array $ast): string
    {
        $printer = new Standard();
        return $printer->prettyPrint($ast);
    }
}