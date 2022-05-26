<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

class Trait_ extends ClassLike
{
    /**
     * Constructs a trait node.
     *
     * @param string|Node\Identifier $name     Name
     * @param array                  $subNodes Array of the following optional subnodes:
     *                                         'stmts'      => array(): Statements
     */
    public function __construct($name, array $subNodes = [])
    {
        $this->name       = \is_string($name) ? new Node\Identifier($name) : $name;
        $this->stmts      = $subNodes['stmts'] ?? [];
    }
}
