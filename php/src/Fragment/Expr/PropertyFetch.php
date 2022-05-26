<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;

class PropertyFetch implements Expr
{
    /** @var Expr Variable holding object */
    public $var;
    /** @var Identifier|Expr Property name */
    public $name;

    /**
     * Constructs a function call node.
     *
     * @param Expr            $var  Variable holding object
     * @param Identifier|Expr $name Property name
     */
    public function __construct(Expr $var, $name)
    {
        $this->var  = $var;
        $this->name = $name;
    }
}
