<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Expr;
use Webmozart\Assert\Assert;

class CallableCall extends CallLike
{
    /** @var Expr */
    public $callable;
    /** @var Arg[] Arguments */
    public $args;

    public function __construct(Expr $callable, array $args = [])
    {
        Assert::allIsInstanceOf($args, Arg::class);
        $this->args     = $args;
        $this->callable = $callable;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
