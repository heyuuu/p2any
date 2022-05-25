<?php

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use Webmozart\Assert\Assert;

class StrConcat implements Expr
{
    /**
     * @var Expr[]
     */
    private $parts;

    /**
     * @param Expr[] $parts
     */
    public function __construct(array $parts)
    {
        Assert::notEmpty($parts);
        Assert::allIsInstanceOf($parts, Expr::class);
        $this->parts = $parts;
    }

    /**
     * @return Expr[]
     */
    public function getParts(): array
    {
        return $this->parts;
    }
}