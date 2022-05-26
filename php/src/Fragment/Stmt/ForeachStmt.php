<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class ForeachStmt implements Stmt
{
    /** @var Expr Expression to iterate */
    public $expr;
    /** @var Expr|null Variable to assign key to */
    public $keyVar;
    /** @var bool Whether to assign value by reference */
    public $byRef;
    /** @var Expr Variable to assign value to */
    public $valueVar;
    /** @var Stmt[] Statements */
    public $stmts;

    public function __construct(
        Expr $expr,
        ?Expr $keyVar,
        bool $byRef,
        Expr $valueVar,
        array $stmts
    ) {
        Assert::allIsInstanceOf($stmts, Stmt::class);

        $this->expr     = $expr;
        $this->keyVar   = $keyVar;
        $this->byRef    = $byRef;
        $this->valueVar = $valueVar;
        $this->stmts    = $stmts;
    }
}
