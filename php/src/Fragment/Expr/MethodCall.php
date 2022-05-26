<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;

class MethodCall extends CallLike
{
    /** @var Expr Variable holding object */
    public $var;
    /** @var Identifier|Expr Method name */
    public $name;
    /** @var array<Arg> Arguments */
    public $args;

    /**
     * Constructs a function call node.
     *
     * @param Expr                   $var  Variable holding object
     * @param string|Identifier|Expr $name Method name
     * @param array<Arg>             $args Arguments
     */
    public function __construct(Expr $var, $name, array $args = [])
    {
        $this->var  = $var;
        $this->name = \is_string($name) ? new Identifier($name) : $name;
        $this->args = $args;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
