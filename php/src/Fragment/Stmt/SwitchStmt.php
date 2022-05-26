<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use P2Any\Fragment\Stmt\Part\SwitchCaseBranch;
use Webmozart\Assert\Assert;

class SwitchStmt implements Stmt
{
    /** @var Expr Condition */
    public $expr;
    /** @var SwitchCaseBranch[] Case list */
    public $cases;

    public function __construct(Expr $expr, array $cases)
    {
        Assert::allIsInstanceOf($cases, SwitchCaseBranch::class);
        $this->expr  = $expr;
        $this->cases = $cases;
    }
}
