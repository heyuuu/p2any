<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class UnaryMinus implements Expr
{
    /** @var Expr Expression */
    public $expr;

    /**
     * Constructs a unary minus node.
     *
     * @param Expr $expr Expression
     */
    public function __construct(Expr $expr)
    {
        $this->expr       = $expr;
    }
}
