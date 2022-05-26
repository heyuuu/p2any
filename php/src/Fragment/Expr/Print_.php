<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Print_ implements Expr
{
    /** @var Expr Expression */
    public $expr;

    /**
     * Constructs an print() node.
     *
     * @param Expr $expr Expression
     */
    public function __construct(Expr $expr)
    {
        $this->expr       = $expr;
    }
}
