<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;
use P2Any\Fragment\Name;

class ClassConstFetch implements Expr
{
    /** @var Name|Expr Class name */
    public $class;
    /** @var string Constant name */
    public $name;

    /**
     * Constructs a class const fetch node.
     *
     * @param Name|Expr         $class Class name
     * @param string|Identifier $name  Constant name
     */
    public function __construct($class, string $name)
    {
        $this->class = $class;
        $this->name  = $name;
    }
}
