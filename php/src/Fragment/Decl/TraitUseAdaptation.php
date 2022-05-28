<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

abstract class TraitUseAdaptation implements Stmt
{
    /** @var Node\Name|null Trait name */
    public $trait;
    /** @var Node\Identifier Method name */
    public $method;
}
