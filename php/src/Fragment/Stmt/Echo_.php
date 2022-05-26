<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class Echo_ implements Stmt
{
    /** @var Expr[] Expressions */
    public $exprs;

    public function __construct(array $exprs)
    {
        Assert::allIsInstanceOf($exprs, Expr::class);
        $this->exprs = $exprs;
    }
}
