<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node;

use P2Any\PhpParser\Node;

interface FunctionLike extends Node
{
    /**
     * Whether to return by reference
     *
     * @return bool
     */
    public function returnsByRef(): bool;

    /**
     * List of parameters
     *
     * @return Param[]
     */
    public function getParams(): array;

    /**
     * Get the declared return type or null
     *
     * @return Identifier|Name|ComplexType|null
     */
    public function getReturnType();

    /**
     * The function body
     *
     * @return Stmt[]|null
     */
    public function getStmts();
}
