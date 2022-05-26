<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class Unset_ implements Stmt
{
    /** @var Expr[] Variables to unset */
    public $vars;

    public function __construct(array $vars)
    {
        Assert::allIsInstanceOf($vars, Expr::class);
        $this->vars = $vars;
    }
}
