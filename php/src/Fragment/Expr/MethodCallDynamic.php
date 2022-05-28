<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Expr;

class MethodCallDynamic extends CallLike
{
    /** @var Expr Variable holding object */
    public $var;
    /** @var Expr Method name */
    public $name;
    /** @var Arg[] Arguments */
    public $args;

    public function __construct(Expr $var, Expr $name, array $args = [])
    {
        $this->var  = $var;
        $this->name = $name;
        $this->args = $args;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
