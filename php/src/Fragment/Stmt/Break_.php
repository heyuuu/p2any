<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;

class Break_ implements StopStmt
{
    /** @var Expr|null Number of loops to break */
    public $num;

    public function __construct(Expr $num = null)
    {
        $this->num = $num;
    }
}
