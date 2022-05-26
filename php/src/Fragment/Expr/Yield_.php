<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Yield_ implements Expr
{
    /** @var Expr|null Key expression */
    public $key;
    /** @var Expr|null Value expression */
    public $value;

    /**
     * Constructs a yield expression node.
     *
     * @param Expr|null $value Value expression
     * @param Expr|null $key   Key expression
     */
    public function __construct(Expr $value = null, Expr $key = null)
    {
        $this->key        = $key;
        $this->value      = $value;
    }
}
