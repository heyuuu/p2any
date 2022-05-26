<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class ClosureUse implements Expr
{
    /** @var Expr\Variable Variable to use */
    public $var;
    /** @var bool Whether to use by reference */
    public $byRef;

    /**
     * Constructs a closure use node.
     *
     * @param Expr\Variable $var   Variable to use
     * @param bool          $byRef Whether to use by reference
     */
    public function __construct(Expr\Variable $var, bool $byRef = false)
    {
        $this->var   = $var;
        $this->byRef = $byRef;
    }
}
