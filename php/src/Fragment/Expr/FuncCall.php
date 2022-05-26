<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Name;
use Webmozart\Assert\Assert;

class FuncCall extends CallLike
{
    /** @var Name Function name */
    public $name;
    /** @var Arg[] Arguments */
    public $args;

    public function __construct(Name $name, array $args = [])
    {
        Assert::allIsInstanceOf($args, Arg::class);
        $this->name = $name;
        $this->args = $args;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
