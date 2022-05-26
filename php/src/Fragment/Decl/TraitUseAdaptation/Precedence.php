<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt\TraitUseAdaptation;

use P2Any\Fragment\Stmt\TraitUseAdaptation;

class Precedence extends TraitUseAdaptation
{
    /** @var Node\Name[] Overwritten traits */
    public $insteadof;

    /**
     * Constructs a trait use precedence adaptation node.
     *
     * @param Node\Name              $trait     Trait name
     * @param string|Node\Identifier $method    Method name
     * @param Node\Name[]            $insteadof Overwritten traits
     */
    public function __construct(Node\Name $trait, $method, array $insteadof)
    {
        $this->trait      = $trait;
        $this->method     = \is_string($method) ? new Node\Identifier($method) : $method;
        $this->insteadof  = $insteadof;
    }
}
