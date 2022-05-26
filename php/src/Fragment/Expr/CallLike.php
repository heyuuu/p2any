<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Expr;

abstract class CallLike implements Expr
{
    /**
     * Assert that this is not a first-class callable and return only ordinary Args.
     *
     * @return Arg[]
     */
    abstract public function getArgs(): array;
}
