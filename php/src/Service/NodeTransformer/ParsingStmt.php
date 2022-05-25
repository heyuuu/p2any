<?php

namespace P2Any\Service\NodeTransformer;

use P2Any\Fragment;
use P2Any\PhpParser\Node;

class ParsingStmt implements ParsingFragment, Fragment\Stmt
{
    /**
     * @var Node\Stmt
     */
    private $stmt;

    public function __construct(Node\Stmt $stmt)
    {
        $this->stmt = $stmt;
    }

    /**
     * @return Node\Stmt
     */
    public function getStmt(): Node\Stmt
    {
        return $this->stmt;
    }
}