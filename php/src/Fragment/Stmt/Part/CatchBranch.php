<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Name;
use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class CatchBranch
{
    /** @var Name[] Types of exceptions to catch */
    public $types;
    /** @var Expr\Variable Variable for exception */
    public $var;
    /** @var Stmt[] Statements */
    public $stmts;

    public function __construct(
        array $types,
        Expr\Variable $var,
        array $stmts
    ) {
        Assert::allIsInstanceOf($types, Name::class);
        Assert::allIsInstanceOf($stmts, Stmt::class);

        $this->types = $types;
        $this->var   = $var;
        $this->stmts = $stmts;
    }
}
