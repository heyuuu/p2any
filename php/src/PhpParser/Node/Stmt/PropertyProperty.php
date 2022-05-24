<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;

class PropertyProperty extends Node\Stmt
{
    /** @var Node\VarLikeIdentifier Name */
    public $name;
    /** @var Node\Expr|null Default */
    public $default;

    /**
     * Constructs a class property node.
     *
     * @param string|Node\VarLikeIdentifier $name       Name
     * @param Node\Expr|null                $default    Default value
     * @param array                         $attributes Additional attributes
     */
    public function __construct($name, Node\Expr $default = null, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->name       = \is_string($name) ? new Node\VarLikeIdentifier($name) : $name;
        $this->default    = $default;
    }

    public function getSubNodeNames(): array
    {
        return ['name', 'default'];
    }

    public function getType(): string
    {
        return 'Stmt_PropertyProperty';
    }
}
