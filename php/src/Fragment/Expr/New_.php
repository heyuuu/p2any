<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Name;
use Webmozart\Assert\Assert;

class New_ extends CallLike
{
    /** @var Name Class name */
    public $class;
    /** @var Arg[] Arguments */
    public $args;

    public function __construct(Name $class, array $args = [])
    {
        Assert::allIsInstanceOf($args, Arg::class);
        $this->class = $class;
        $this->args  = $args;
    }

    public function getArgs(): array
    {
        return $this->args;
    }
}
