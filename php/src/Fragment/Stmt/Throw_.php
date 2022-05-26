<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;

class Throw_ implements StopStmt
{
    /** @var Expr Expression */
    public $expr;

    public function __construct(Expr $expr)
    {
        $this->expr = $expr;
    }
}
