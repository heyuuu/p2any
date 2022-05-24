<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Arg;
use P2Any\PhpParser\Node\Expr;

class New_ extends CallLike
{
    /** @var Node\Name|Expr|Node\Stmt\Class_ Class name */
    public $class;
    /** @var array<Arg> Arguments */
    public $args;

    /**
     * Constructs a function call node.
     *
     * @param Node\Name|Expr|Node\Stmt\Class_ $class      Class name (or class node for anonymous classes)
     * @param array<Arg>                      $args       Arguments
     * @param array                           $attributes Additional attributes
     */
    public function __construct($class, array $args = [], array $attributes = [])
    {
        parent::__construct($attributes);
        $this->class = $class;
        $this->args  = $args;
    }

    public function getSubNodeNames(): array
    {
        return ['class', 'args'];
    }

    public function getType(): string
    {
        return 'Expr_New';
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
