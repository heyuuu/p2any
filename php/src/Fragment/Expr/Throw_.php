<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

class Throw_ extends Node\Expr
{
    /** @var Node\Expr Expression */
    public $expr;

    /**
     * Constructs a throw expression node.
     *
     * @param Node\Expr $expr Expression
     */
    public function __construct(Node\Expr $expr)
    {
        $this->expr = $expr;
    }
}
