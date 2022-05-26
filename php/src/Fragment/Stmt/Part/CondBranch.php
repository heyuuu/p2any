<?php

namespace P2Any\Fragment\Stmt\Part;

use P2Any\Fragment\Expr;
use P2Any\Fragment\StmtList;

class CondBranch
{
    /** @var Expr Condition */
    public $cond;
    /** @var StmtList Statements */
    public $stmts;

    public function __construct(Expr $cond, StmtList $stmts)
    {
        $this->cond  = $cond;
        $this->stmts = $stmts;
    }
}