<?php

namespace P2Any\Fragment\Stmt\Part;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class CondBranch
{
    /** @var Expr Condition */
    public $cond;
    /** @var Stmt[] Statements */
    public $stmts;

    public function __construct(Expr $cond, array $stmts)
    {
        Assert::allIsInstanceOf($stmts, Stmt::class);
        $this->cond  = $cond;
        $this->stmts = $stmts;
    }
}