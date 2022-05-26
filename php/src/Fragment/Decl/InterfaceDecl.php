<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Decl;
use P2Any\Fragment\Name;
use Webmozart\Assert\Assert;

class InterfaceDecl implements Decl
{
    /** @var Name Name */
    public $name;
    /** @var Name[] Extended interfaces */
    public $extends;
    /** @var ClassConst[] */
    public $constants;
    /** @var ClassMethod[] */
    public $methods;

    public function __construct(
        array $name,
        array $extends = [],
        array $constants = [],
        array $methods = []
    ) {
        Assert::isInstanceOf($name, Name::class);
        Assert::allIsInstanceOf($extends, Name::class);
        Assert::allIsInstanceOf($constants, ClassConst::class);
        Assert::allIsInstanceOf($constants, ClassMethod::class);

        $this->name      = $name;
        $this->extends   = $extends;
        $this->constants = $constants;
        $this->methods   = $methods;
    }
}
