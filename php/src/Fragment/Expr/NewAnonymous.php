<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Arg;
use P2Any\Fragment\Decl\ClassDecl;
use Webmozart\Assert\Assert;

class NewAnonymous extends CallLike
{
    /** @var ClassDecl Class name */
    public $class;
    /** @var Arg[] Arguments */
    public $args;

    public function __construct(ClassDecl $class, array $args = [])
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
