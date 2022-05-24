<?php declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Expr;

class FuncCall extends CallLike
{
    /** @var Node\Name|Expr Function name */
    public $name;
    /** @var array<Node\Arg> Arguments */
    public $args;

    /**
     * Constructs a function call node.
     *
     * @param Node\Name|Expr  $name       Function name
     * @param array<Node\Arg> $args       Arguments
     * @param array           $attributes Additional attributes
     */
    public function __construct($name, array $args = [], array $attributes = [])
    {
        parent::__construct($attributes);
        $this->name = $name;
        $this->args = $args;
    }

    public function getSubNodeNames(): array
    {
        return ['name', 'args'];
    }

    public function getType(): string
    {
        return 'Expr_FuncCall';
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
