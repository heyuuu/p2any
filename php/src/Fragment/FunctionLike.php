<?php

declare(strict_types=1);

namespace P2Any\Fragment;

use P2Any\Fragment;

interface FunctionLike extends Fragment
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
     * @return TypeHint|null
     */
    public function getReturnType(): ?TypeHint;

    /**
     * The function body
     *
     * @return Stmt[]|null
     */
    public function getStmts();
}
