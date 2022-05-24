<?php declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node\Arg;
use P2Any\PhpParser\Node\Expr;

abstract class CallLike extends Expr
{
    /**
     * Assert that this is not a first-class callable and return only ordinary Args.
     *
     * @return Arg[]
     */
    abstract public function getArgs(): array;
}