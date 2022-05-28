<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\FunctionLike;
use P2Any\Fragment\Param;
use P2Any\Fragment\Stmt;
use P2Any\Fragment\TypeHint;
use Webmozart\Assert\Assert;

class Closure implements Expr, FunctionLike
{
    /** @var bool Whether the closure is static */
    public $static;
    /** @var bool Whether to return by reference */
    public $byRef;
    /** @var Param[] Parameters */
    public $params;
    /** @var Expr\Part\ClosureUse[] use()s */
    public $uses;
    /** @var TypeHint|null Return type */
    public $returnType;
    /** @var Stmt[] Statements */
    public $stmts;

    public function __construct(
        bool $static = false,
        bool $byRef = false,
        array $params = [],
        array $uses = [],
        TypeHint $returnType = null,
        array $stmts = []
    ) {
        Assert::allIsInstanceOf($params, Param::class);
        Assert::allIsInstanceOf($uses, Expr\Part\ClosureUse::class);
        Assert::allIsInstanceOf($stmts, Stmt::class);

        $this->static     = $static;
        $this->byRef      = $byRef;
        $this->params     = $params;
        $this->uses       = $uses;
        $this->returnType = $returnType;
        $this->stmts      = $stmts;
    }

    public function returnsByRef(): bool
    {
        return $this->byRef;
    }

    public function getParams(): array
    {
        return $this->params;
    }

    public function getReturnType(): ?TypeHint
    {
        return $this->returnType;
    }

    public function getStmts(): array
    {
        return $this->stmts;
    }
}
