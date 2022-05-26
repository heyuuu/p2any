<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class PostDec implements Expr
{
    /** @var Expr Variable */
    public $var;

    /**
     * Constructs a post decrement node.
     *
     * @param Expr $var Variable
     */
    public function __construct(Expr $var)
    {
        $this->var = $var;
    }
}
