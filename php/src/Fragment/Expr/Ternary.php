<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Ternary implements Expr
{
    /** @var Expr Condition */
    public $cond;
    /** @var Expr|null Expression for true */
    public $if;
    /** @var Expr Expression for false */
    public $else;

    /**
     * Constructs a ternary operator node.
     *
     * @param Expr      $cond Condition
     * @param Expr|null $if   Expression for true
     * @param Expr      $else Expression for false
     */
    public function __construct(Expr $cond, $if, Expr $else)
    {
        $this->cond       = $cond;
        $this->if         = $if;
        $this->else       = $else;
    }
}
