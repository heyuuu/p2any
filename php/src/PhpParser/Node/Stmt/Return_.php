<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;

class Return_ extends Node\Stmt
{
    /** @var Node\Expr|null Expression */
    public $expr;

    /**
     * Constructs a return node.
     *
     * @param Node\Expr|null $expr       Expression
     * @param array          $attributes Additional attributes
     */
    public function __construct(Node\Expr $expr = null, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->expr       = $expr;
    }

    public function getSubNodeNames(): array
    {
        return ['expr'];
    }

    public function getType(): string
    {
        return 'Stmt_Return';
    }
}
