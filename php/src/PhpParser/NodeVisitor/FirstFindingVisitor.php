<?php

declare(strict_types=1);

namespace P2Any\PhpParser\NodeVisitor;

use P2Any\PhpParser\Node;
use P2Any\PhpParser\NodeTraverser;
use P2Any\PhpParser\NodeVisitorAbstract;

/**
 * This visitor can be used to find the first node satisfying some criterion determined by
 * a filter callback.
 */
class FirstFindingVisitor extends NodeVisitorAbstract
{
    /** @var callable Filter callback */
    protected $filterCallback;
    /** @var Node|null Found node */
    protected $foundNode;

    public function __construct(callable $filterCallback)
    {
        $this->filterCallback = $filterCallback;
    }

    /**
     * Get found node satisfying the filter callback.
     *
     * Returns null if no node satisfies the filter callback.
     *
     * @return Node|null Found node (or null if not found)
     */
    public function getFoundNode()
    {
        return $this->foundNode;
    }

    public function beforeTraverse(array $nodes)
    {
        $this->foundNode = null;

        return null;
    }

    public function enterNode(Node $node)
    {
        $filterCallback = $this->filterCallback;
        if ($filterCallback($node)) {
            $this->foundNode = $node;
            return NodeTraverser::STOP_TRAVERSAL;
        }

        return null;
    }
}
