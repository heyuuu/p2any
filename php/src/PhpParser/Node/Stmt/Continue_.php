<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;

class Continue_ extends Node\Stmt
{
    /** @var Node\Expr|null Number of loops to continue */
    public $num;

    /**
     * Constructs a continue node.
     *
     * @param Node\Expr|null $num        Number of loops to continue
     * @param array          $attributes Additional attributes
     */
    public function __construct(Node\Expr $num = null, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->num        = $num;
    }

    public function getSubNodeNames(): array
    {
        return ['num'];
    }

    public function getType(): string
    {
        return 'Stmt_Continue';
    }
}
