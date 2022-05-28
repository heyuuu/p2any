<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class InstanceofDynamic implements Expr
{
    /** @var Expr Expression */
    public $expr;
    /** @var Expr Class name */
    public $class;

    public function __construct(Expr $expr, Expr $class)
    {
        $this->expr  = $expr;
        $this->class = $class;
    }
}
