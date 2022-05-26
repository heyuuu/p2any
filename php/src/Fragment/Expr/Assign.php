<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Assign implements Expr
{
    /** @var Expr Variable */
    public $var;
    /** @var Expr Expression */
    public $expr;

    /**
     * Constructs an assignment node.
     *
     * @param Expr $var  Variable
     * @param Expr $expr Expression
     */
    public function __construct(Expr $var, Expr $expr)
    {
        $this->var  = $var;
        $this->expr = $expr;
    }
}
