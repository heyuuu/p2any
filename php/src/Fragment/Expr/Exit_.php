<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Exit_ implements Expr
{
    /** @var Expr|null Expression */
    public $expr;

    public function __construct(Expr $expr = null)
    {
        $this->expr = $expr;
    }
}
