<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class PreInc implements Expr
{
    /** @var Expr Variable */
    public $var;

    public function __construct(Expr $var)
    {
        $this->var = $var;
    }
}
