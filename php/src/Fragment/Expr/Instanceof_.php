<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Name;

class Instanceof_ implements Expr
{
    /** @var Expr Expression */
    public $expr;
    /** @var Name Class name */
    public $class;

    public function __construct(Expr $expr, Name $class)
    {
        $this->expr  = $expr;
        $this->class = $class;
    }
}
