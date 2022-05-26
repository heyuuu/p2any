<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Name;

class ConstFetch implements Expr
{
    /** @var Name Constant name */
    public $name;

    /**
     * Constructs a const fetch node.
     *
     * @param Name $name Constant name
     */
    public function __construct(Name $name)
    {
        $this->name = $name;
    }
}
