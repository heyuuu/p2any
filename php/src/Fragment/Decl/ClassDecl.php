<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\Decl;
use P2Any\Fragment\Name;
use P2Any\Fragment\Stmt\ClassConst;
use P2Any\Fragment\Stmt\ClassMethod;
use P2Any\Fragment\Stmt\Property;
use P2Any\Fragment\Stmt\TraitUse;

class ClassDecl implements Decl
{
    /** @var Name */
    public $name;
    /** @var int Type */
    public $flags;
    /** @var Name|null Name of extended class */
    public $extends;
    /** @var Name[] Names of implemented interfaces */
    public $implements;
    /** @var ClassConst[] */
    public $constants;
    /** @var Property[] */
    public $properties;
    /** @var ClassMethod[] */
    public $methods;
    /** @var TraitUse[] */
    public $traitUses;

    public function __construct(
        ?Name $name,
        int $flags,
        ?Name $extends,
        array $implements,
        array $constants,
        array $properties,
        array $methods,
        array $traitUses = []
    ) {
        $this->name       = $name;
        $this->flags      = $flags;
        $this->extends    = $extends;
        $this->implements = $implements;
        $this->constants  = $constants;
        $this->properties = $properties;
        $this->methods    = $methods;
        $this->traitUses  = $traitUses;
    }

    /**
     * Whether the class is anonymous.
     */
    public function isAnonymous(): bool
    {
        return null === $this->name;
    }
}
