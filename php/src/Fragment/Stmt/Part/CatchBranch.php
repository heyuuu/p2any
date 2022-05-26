<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Name;
use P2Any\Fragment\Stmt;
use P2Any\Fragment\StmtList;
use Webmozart\Assert\Assert;

class CatchBranch
{
    /** @var Name[] Types of exceptions to catch */
    public $types;
    /** @var Expr\Variable Variable for exception */
    public $var;
    /** @var StmtList Statements */
    public $stmts;

    public function __construct(
        array $types,
        Expr\Variable $var,
        StmtList $stmts
    ) {
        Assert::allIsInstanceOf($types, Name::class);

        $this->types = $types;
        $this->var   = $var;
        $this->stmts = $stmts;
    }
}
