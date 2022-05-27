<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use P2Any\Fragment\Stmt\Part\CondBranch;
use Webmozart\Assert\Assert;

class WhileStmt implements Stmt
{
    const TYPE_WHILE    = 'while';
    const TYPE_DO_WHILE = 'do';

    /** @var string */
    private $type;
    /** @var Expr Condition */
    public $cond;
    /** @var Stmt[] Statements */
    public $stmts;

    private function __construct(string $type, Expr $cond, array $stmts)
    {
        Assert::allIsInstanceOf($stmts, Stmt::class);
        $this->type  = $type;
        $this->cond  = $cond;
        $this->stmts = $stmts;
    }

    /**
     * @param Expr   $cond
     * @param Stmt[] $stmts
     * @return WhileStmt
     */
    public static function while(Expr $cond, array $stmts): WhileStmt
    {
        Assert::allIsInstanceOf($stmts, Stmt::class);
        return new WhileStmt(self::TYPE_WHILE, $cond, $stmts);
    }

    /**
     * @param Expr   $cond
     * @param Stmt[] $stmts
     * @return WhileStmt
     */
    public static function doWhile(Expr $cond, array $stmts): WhileStmt
    {
        Assert::allIsInstanceOf($stmts, Stmt::class);
        return new WhileStmt(self::TYPE_DO_WHILE, $cond, $stmts);
    }
}
