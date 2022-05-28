<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

class PropertyProperty implements Stmt
{
    /** @var Node\VarLikeIdentifier Name */
    public $name;
    /** @var Node\Expr|null Default */
    public $default;

    /**
     * Constructs a class property node.
     *
     * @param string|Node\VarLikeIdentifier $name    Name
     * @param Node\Expr|null                $default Default value
     */
    public function __construct($name, Node\Expr $default = null)
    {
        $this->name       = \is_string($name) ? new Node\VarLikeIdentifier($name) : $name;
        $this->default    = $default;
    }
}
