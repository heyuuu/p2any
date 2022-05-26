<?php

namespace P2Any\Fragment;

use P2Any\Fragment;

class StmtList implements Fragment
{
    /**
     * @var Stmt[]
     */
    private $stmts;

    public function __construct(array $stmts)
    {
        $this->stmts = $stmts;
    }

    /**
     * @return Stmt[]
     */
    public function getStmts(): array
    {
        return $this->stmts;
    }
}