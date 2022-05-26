<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;
use P2Any\Fragment\Name;
use P2Any\Fragment\VarLikeIdentifier;

class StaticPropertyFetch implements Expr
{
    /** @var Name|Expr Class name */
    public $class;
    /** @var VarLikeIdentifier|Expr Property name */
    public $name;

    public function __construct(Name $class, Identifier $name)
    {
        $this->class = $class;
        $this->name  = $name;
    }
}
