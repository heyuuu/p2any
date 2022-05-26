<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

class TraitUse implements Stmt
{
    /** @var Node\Name[] Traits */
    public $traits;
    /** @var TraitUseAdaptation[] Adaptations */
    public $adaptations;

    /**
     * Constructs a trait use node.
     *
     * @param Node\Name[]          $traits      Traits
     * @param TraitUseAdaptation[] $adaptations Adaptations
     */
    public function __construct(array $traits, array $adaptations = [])
    {
        $this->traits      = $traits;
        $this->adaptations = $adaptations;
    }
}
