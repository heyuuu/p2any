<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;

class StaticVar implements Stmt
{
    /** @var Expr\Variable Variable */
    public $var;
    /** @var Node\Expr|null Default value */
    public $default;

    /**
     * Constructs a static variable node.
     *
     * @param Expr\Variable  $var     Name
     * @param Node\Expr|null $default Default value
     */
    public function __construct(
        Expr\Variable $var,
        Node\Expr $default = null
    ) {
        $this->var     = $var;
        $this->default = $default;
    }
}
