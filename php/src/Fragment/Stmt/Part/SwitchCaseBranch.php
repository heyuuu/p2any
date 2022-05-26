<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt\Part;

use P2Any\Fragment\Expr;
use P2Any\Fragment\StmtList;

class SwitchCaseBranch
{
    /** @var Expr|null Condition (null for default) */
    public $cond;
    /** @var StmtList Statements */
    public $stmts;

    public function __construct(?Expr $cond, StmtList $stmts)
    {
        $this->cond  = $cond;
        $this->stmts = $stmts;
    }
}
