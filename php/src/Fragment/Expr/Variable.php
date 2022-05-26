<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;

class Variable implements Expr
{
    /** @var Identifier Name */
    public $name;

    /**
     * Constructs a variable node.
     *
     * @param Identifier $name Name
     */
    public function __construct(Identifier $name)
    {
        $this->name = $name;
    }
}
