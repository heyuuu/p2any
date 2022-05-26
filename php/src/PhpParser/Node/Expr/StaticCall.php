<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Arg;
use P2Any\PhpParser\Node\Expr;
use P2Any\PhpParser\Node\Identifier;
use Webmozart\Assert\Assert;

class StaticCall extends CallLike
{
    /** @var Node\Name|Expr Class name */
    public $class;
    /** @var Identifier|Expr Method name */
    public $name;
    /** @var array<Arg> Arguments */
    public $args;

    /**
     * Constructs a static method call node.
     *
     * @param Node\Name|Expr         $class      Class name
     * @param string|Identifier|Expr $name       Method name
     * @param array<Arg>             $args       Arguments
     * @param array                  $attributes Additional attributes
     */
    public function __construct($class, $name, array $args = [], array $attributes = [])
    {
        parent::__construct($attributes);
        Assert::allIsInstanceOf($args, Arg::class);
        $this->class = $class;
        $this->name  = \is_string($name) ? new Identifier($name) : $name;
        $this->args  = $args;
    }

    public function getSubNodeNames(): array
    {
        return ['class', 'name', 'args'];
    }

    public function getType(): string
    {
        return 'Expr_StaticCall';
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
