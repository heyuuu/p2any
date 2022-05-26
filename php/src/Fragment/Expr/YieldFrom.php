<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class YieldFrom implements Expr
{
    /** @var Expr Expression to yield from */
    public $expr;

    /**
     * Constructs an "yield from" node.
     *
     * @param Expr $expr Expression
     */
    public function __construct(Expr $expr)
    {
        $this->expr       = $expr;
    }
}
