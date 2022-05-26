<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class UnaryPlus implements Expr
{
    /** @var Expr Expression */
    public $expr;

    /**
     * Constructs a unary plus node.
     *
     * @param Expr $expr Expression
     */
    public function __construct(Expr $expr)
    {
        $this->expr       = $expr;
    }
}
