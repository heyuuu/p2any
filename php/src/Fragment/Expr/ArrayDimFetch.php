<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class ArrayDimFetch implements Expr
{
    /** @var Expr Variable */
    public $var;
    /** @var Expr|null Array index / dim */
    public $dim;

    /**
     * Constructs an array index fetch node.
     *
     * @param Expr      $var Variable
     * @param Expr|null $dim Array index / dim
     */
    public function __construct(Expr $var, Expr $dim = null)
    {
        $this->var = $var;
        $this->dim = $dim;
    }
}
