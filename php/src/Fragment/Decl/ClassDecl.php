<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\Decl;
use P2Any\Fragment\Decl\Part\ClassConst;
use P2Any\Fragment\Decl\Part\Method;
use P2Any\Fragment\Decl\Part\Property;
use P2Any\Fragment\Name;
use Webmozart\Assert\Assert;

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
    /** @var Method[] */
    public $methods;

    public function __construct(
        ?Name $name,
        int $flags,
        ?Name $extends,
        array $implements,
        array $constants,
        array $properties,
        array $methods
    ) {
        Assert::allIsInstanceOf($implements, Name::class);
        Assert::allIsInstanceOf($implements, Name::class);

        $this->name       = $name;
        $this->flags      = $flags;
        $this->extends    = $extends;
        $this->implements = $implements;
        $this->constants  = $constants;
        $this->properties = $properties;
        $this->methods    = $methods;
    }

    /**
     * Whether the class is anonymous.
     */
    public function isAnonymous(): bool
    {
        return null === $this->name;
    }
}
