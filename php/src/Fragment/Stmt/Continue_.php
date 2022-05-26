<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;

class Continue_ implements StopStmt
{
    /** @var Expr|null Number of loops to continue */
    public $num;

    public function __construct(Expr $num = null)
    {
        $this->num = $num;
    }
}
