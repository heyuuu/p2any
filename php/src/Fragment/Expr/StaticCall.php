<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;
use P2Any\Fragment\Name;

class StaticCall extends CallLike
{
    /** @var Name Class name */
    public $class;
    /** @var Identifier Method name */
    public $name;
    /** @var Arg[] Arguments */
    public $args;

    /**
     * Constructs a static method call node.
     *
     * @param Name       $class Class name
     * @param Identifier $name  Method name
     * @param Arg[]      $args  Arguments
     */
    public function __construct(Name $class, Identifier $name, array $args = [])
    {
        $this->class = $class;
        $this->name  = $name;
        $this->args  = $args;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
