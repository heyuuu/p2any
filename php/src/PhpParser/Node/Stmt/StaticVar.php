<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Expr;

class StaticVar extends Node\Stmt
{
    /** @var Expr\Variable Variable */
    public $var;
    /** @var Node\Expr|null Default value */
    public $default;

    /**
     * Constructs a static variable node.
     *
     * @param Expr\Variable  $var        Name
     * @param Node\Expr|null $default    Default value
     * @param array          $attributes Additional attributes
     */
    public function __construct(
        Expr\Variable $var, Node\Expr $default = null, array $attributes = []
    ) {
        $this->attributes = $attributes;
        $this->var        = $var;
        $this->default    = $default;
    }

    public function getSubNodeNames(): array
    {
        return ['var', 'default'];
    }

    public function getType(): string
    {
        return 'Stmt_StaticVar';
    }
}
