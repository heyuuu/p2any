<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;

class Global_ implements Stmt
{
    /** @var Expr[] Variables */
    public $vars;

    /**
     * Constructs a global variables list node.
     *
     * @param Expr[] $vars Variables to unset
     */
    public function __construct(array $vars)
    {
        $this->vars = $vars;
    }
}
