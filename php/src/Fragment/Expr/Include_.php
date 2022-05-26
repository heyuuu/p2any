<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Include_ implements Expr
{
    const TYPE_INCLUDE      = 1;
    const TYPE_INCLUDE_ONCE = 2;
    const TYPE_REQUIRE      = 3;
    const TYPE_REQUIRE_ONCE = 4;

    /** @var Expr Expression */
    public $expr;
    /** @var int Type of include */
    public $type;

    /**
     * Constructs an include node.
     *
     * @param Expr $expr Expression
     * @param int  $type Type of include
     */
    public function __construct(Expr $expr, int $type)
    {
        $this->expr = $expr;
        $this->type = $type;
    }
}
