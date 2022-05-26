<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;

class ExprStmt implements Stmt
{
    /** @var Expr Expression */
    public $expr;

    public function __construct(Expr $expr)
    {
        $this->expr = $expr;
    }
}