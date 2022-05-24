<?php

namespace P2Any\Service;

use P2Any\Exception\TodoException;
use P2Any\Fragment;
use P2Any\PhpParser\Node;
use P2Any\Service\NodeTransformer\TempListFragment;
use Webmozart\Assert\Assert;

abstract class NodeTransformerAbstract
{
    const NODE_NS = "P2Any\\PhpParser\\Node\\";

    protected $visitMethods = [];

    /**
     * @param Node[] $nodes
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
        $method = $this->findVisitMethod($node);
        return $this->{$method}($node);
    }

    private function findVisitMethod(Node $node): string
    {
        $class = get_class($node);
        if (isset($this->visitMethods[$class])) {
            return $this->visitMethods[$class];
        }

        $findClass = $class;
        do {
            $methodName = 'visit' . str_replace([self::NODE_NS, '\\'], '', $findClass);
            if (method_exists($this, $methodName)) {
                return $this->visitMethods[$class] = $methodName;
            }
        } while ($findClass = get_parent_class($findClass));

        throw new TodoException("此 Node 类型未定义处理函数: " . $class);
    }
}