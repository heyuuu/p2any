<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\Decl;
use P2Any\Fragment\FunctionLike;
use P2Any\Fragment\Param;
use P2Any\Fragment\TypeHint;

class FunctionDecl implements Decl, FunctionLike
{
    /** @var bool Whether function returns by reference */
    public $byRef;
    /** @var string Name */
    public $name;
    /** @var Param[] Parameters */
    public $params;
    /** @var TypeHint|null Return type */
    public $returnType;
    /** @var Node\Stmt[] Statements */
    public $stmts;

    public function __construct(
        string $name,
        bool $byRef,
        array $params,
        TypeHint $returnType,
        array $stmts
    ) {
        $this->name       = $name;
        $this->byRef      = $byRef;
        $this->params     = $params;
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

    /** @return Node\Stmt[] */
    public function getStmts(): array
    {
        return $this->stmts;
    }
}
