<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;

class Namespace_ extends Node\Stmt
{
    /* For use in the "kind" attribute */
    const KIND_SEMICOLON = 1;
    const KIND_BRACED    = 2;

    /** @var Node\Name|null Name */
    public $name;
    /** @var Node\Stmt[] Statements */
    public $stmts;

    /**
     * Constructs a namespace node.
     *
     * @param Node\Name|null   $name       Name
     * @param Node\Stmt[]|null $stmts      Statements
     * @param array            $attributes Additional attributes
     */
    public function __construct(Node\Name $name = null, $stmts = [], array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->name       = $name;
        $this->stmts      = $stmts;
    }

    public function getSubNodeNames(): array
    {
        return ['name', 'stmts'];
    }

    public function getType(): string
    {
        return 'Stmt_Namespace';
    }
}
