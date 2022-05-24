<?php

namespace P2Any\Service;

use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;
use P2Any\Service\NodeTransformer\TempListFragment;
use Webmozart\Assert\Assert;

abstract class NodeTransformerAbstract
{
    const NODE_NS = 'P2Any\\PhpParser\\Node\\';

    protected static $visitMethods     = [];
    protected static $skipTypes        = [];
    protected static $unsupportedTypes = [];

    /**
     * @param Node[] $nodes
     *
     * @return Fragment[]
     */
    public function visitList(array $nodes): array
    {
        Assert::isList($nodes);
        Assert::allIsInstanceOf($nodes, Node::class);
        return collect($nodes)->flatMap(function (Node $node) {
            $fragment = $this->visit($node);
            if ($fragment === null) {
                return [];
            } elseif ($fragment instanceof TempListFragment) {
                return $fragment->getFragments();
            } else {
                return $fragment;
            }
        })->all();
    }

    public function visit(Node $node): ?Fragment
    {
        $nodeClass = get_class($node);
        if (self::isSkipType($nodeClass)) {
            return null;
        } elseif (self::isUnsupportedType($nodeClass)) {
            throw new TodoException('暂不支持的 Node 节点: ' . $nodeClass);
        }

        $method = static::findVisitMethod($nodeClass);
        if ($method === null) {
            throw new TodoException('此 Node 类型未定义处理函数: ' . $nodeClass);
        }
        return $this->{$method}($node);
    }

    public static function calcVisitMethod(string $class): string
    {
        return 'visit' . str_replace([self::NODE_NS, '\\', '_'], '', $class);
    }

    public static function findVisitMethod(string $nodeClass): ?string
    {
        if (!isset(static::$visitMethods[static::class][$nodeClass])) {
            static::$visitMethods[static::class][$nodeClass] = static::findVisitMethodInternal($nodeClass);
        }
        return static::$visitMethods[static::class][$nodeClass];
    }

    protected static function findVisitMethodInternal(string $nodeClass): ?string
    {
        do {
            $method = self::calcVisitMethod($nodeClass);
            if (method_exists(static::class, $method)) {
                return $method;
            }
        } while ($nodeClass = get_parent_class($nodeClass));

        return null;
    }

    public static function isSkipType(string $nodeClass): bool
    {
        return isset(static::$skipTypes[$nodeClass]);
    }

    public static function isUnsupportedType(string $nodeClass): bool
    {
        return isset(static::$unsupportedTypes[$nodeClass]);
    }

    public static function hasHandleType(string $nodeClass): bool
    {
        return static::isSkipType($nodeClass) || static::isUnsupportedType($nodeClass) || self::findVisitMethod($nodeClass) !== null;
    }
}
