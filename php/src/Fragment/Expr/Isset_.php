<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use Webmozart\Assert\Assert;

class Isset_ implements Expr
{
    /** @var Expr[] Variables */
    public $vars;

    /**
     * Constructs an array node.
     *
     * @param Expr[] $vars Variables
     */
    public function __construct(array $vars)
    {
        Assert::allIsInstanceOf($vars, Expr::class);
        $this->vars = $vars;
    }
}
