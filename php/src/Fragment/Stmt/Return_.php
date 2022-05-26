<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;

class Return_ implements StopStmt
{
    /** @var Expr|null Expression */
    public $expr;

    public function __construct(Expr $expr = null)
    {
        $this->expr = $expr;
    }
}
