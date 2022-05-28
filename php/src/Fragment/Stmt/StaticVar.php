<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;
use P2Any\Fragment\Stmt;

class StaticVar implements Stmt
{
    /** @var Identifier Variable */
    public $var;
    /** @var Expr|null Default value */
    public $default;

    public function __construct(
        Identifier $var,
        ?Expr $default = null
    ) {
        $this->var     = $var;
        $this->default = $default;
    }
}
