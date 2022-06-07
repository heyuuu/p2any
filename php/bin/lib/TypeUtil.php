<?php

namespace P2AnyScript;

use Illuminate\Support\Str;
use P2Any\PhpParser\Node;
use P2Any\PhpParser\NodeAbstract;

class TypeUtil
{
    public static function mapType(string $class): ?string
    {
        if ($class === Node::class || $class === NodeAbstract::class) {
            return 'Node';
        } elseif (Str::startsWith($class, Node::class)) {
            return str_replace(['\\', '_'], '', Str::after($class, Node::class));
        } else {
            return null;
        }
    }
}