<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt;

class Const_ implements Stmt
{
    /** @var Node\Const_[] Constant declarations */
    public $consts;

    /**
     * Constructs a const list node.
     *
     * @param Node\Const_[] $consts Constant declarations
     */
    public function __construct(array $consts)
    {
        $this->consts     = $consts;
    }
}
