<?php

namespace P2Any\Service\NodeTransformer;

use P2Any\Fragment;
use P2Any\PhpParser\Node;

class ParsingExpr implements ParsingFragment, Fragment\Expr
{
    /**
     * @var Node\Expr
     */
    private $expr;

    public function __construct(Node\Expr $expr)
    {
        $this->expr = $expr;
    }

    /**
     * @return Node\Expr
     */
    public function getExpr(): Node\Expr
    {
        return $this->expr;
    }
}