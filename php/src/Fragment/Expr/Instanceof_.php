<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;
use P2Any\Fragment\Name;

class Instanceof_ implements Expr
{
    /** @var Expr Expression */
    public $expr;
    /** @var Name|Variable Class name */
    public $class;

    /**
     * Constructs an instanceof check node.
     *
     * @param Expr            $expr  Expression
     * @param Name|Identifier $class Class name
     */
    public function __construct(Expr $expr, $class)
    {
        $this->expr  = $expr;
        $this->class = $class;
    }
}
