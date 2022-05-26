<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class ForStmt implements Stmt
{
    /** @var Expr[] Init expressions */
    public $init;
    /** @var Expr[] Loop conditions */
    public $cond;
    /** @var Expr[] Loop expressions */
    public $loop;
    /** @var Stmt[] Statements */
    public $stmts;

    public function __construct(array $init, array $cond, array $loop, array $stmts)
    {
        Assert::allIsInstanceOf($init, Expr::class);
        Assert::allIsInstanceOf($cond, Expr::class);
        Assert::allIsInstanceOf($loop, Expr::class);
        Assert::allIsInstanceOf($stmts, Stmt::class);
        $this->init  = $init;
        $this->cond  = $cond;
        $this->loop  = $loop;
        $this->stmts = $stmts;
    }
}
