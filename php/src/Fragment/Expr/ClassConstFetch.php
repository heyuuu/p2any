<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;
use P2Any\Fragment\Name;

class ClassConstFetch implements Expr
{
    /** @var Name Class name */
    public $class;
    /** @var Identifier Constant name */
    public $name;

    /**
     * Constructs a class const fetch node.
     *
     * @param Name       $class Class name
     * @param Identifier $name  Constant name
     */
    public function __construct(Name $class, Identifier $name)
    {
        $this->class = $class;
        $this->name  = $name;
    }
}
