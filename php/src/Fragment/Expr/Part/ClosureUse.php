<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr\Part;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;

class ClosureUse
{
    /** @var Expr\Variable Variable to use */
    public $var;
    /** @var bool Whether to use by reference */
    public $byRef;

    public function __construct(Identifier $var, bool $byRef = false)
    {
        $this->var   = $var;
        $this->byRef = $byRef;
    }
}
