<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt\TraitUseAdaptation;

use P2Any\Fragment\Stmt\TraitUseAdaptation;

class Alias extends TraitUseAdaptation
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
     */
    public function __construct($trait, $method, $newModifier, $newName)
    {
        $this->trait       = $trait;
        $this->method      = \is_string($method) ? new Node\Identifier($method) : $method;
        $this->newModifier = $newModifier;
        $this->newName     = \is_string($newName) ? new Node\Identifier($newName) : $newName;
    }
}
