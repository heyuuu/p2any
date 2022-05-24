<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Stmt\TraitUseAdaptation;

use P2Any\PhpParser\Node;

class Alias extends Node\Stmt\TraitUseAdaptation
{
    /** @var int|null New modifier */
    public $newModifier;
    /** @var Node\Identifier|null New name */
    public $newName;

    /**
     * Constructs a trait use precedence adaptation node.
     *
     * @param Node\Name|null              $trait       Trait name
     * @param string|Node\Identifier      $method      Method name
     * @param int|null                    $newModifier New modifier
     * @param string|Node\Identifier|null $newName     New name
     * @param array                       $attributes  Additional attributes
     */
    public function __construct($trait, $method, $newModifier, $newName, array $attributes = [])
    {
        $this->attributes  = $attributes;
        $this->trait       = $trait;
        $this->method      = \is_string($method) ? new Node\Identifier($method) : $method;
        $this->newModifier = $newModifier;
        $this->newName     = \is_string($newName) ? new Node\Identifier($newName) : $newName;
    }

    public function getSubNodeNames(): array
    {
        return ['trait', 'method', 'newModifier', 'newName'];
    }

    public function getType(): string
    {
        return 'Stmt_TraitUseAdaptation_Alias';
    }
}
