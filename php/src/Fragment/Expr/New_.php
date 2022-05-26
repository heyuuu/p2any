<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Expr;

class New_ extends CallLike
{
    /** @var Node\Name|Expr|Node\Stmt\Class_ Class name */
    public $class;
    /** @var array<Arg> Arguments */
    public $args;

    /**
     * Constructs a function call node.
     *
     * @param Node\Name|Expr|Node\Stmt\Class_ $class Class name (or class node for anonymous classes)
     * @param array<Arg>                      $args  Arguments
     */
    public function __construct($class, array $args = [])
    {
        $this->class = $class;
        $this->args  = $args;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
