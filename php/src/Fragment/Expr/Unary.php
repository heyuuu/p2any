<?php

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Unary implements Expr
{
    const OP_PLUS  = '+';
    const OP_MINUS = '-';

    /**
     * @var Expr
     */
    private $expr;

    /**
     * @var string
     */
    private $operator;

    public function __construct(Expr $expr, string $operator)
    {
        $this->expr     = $expr;
        $this->operator = $operator;
    }

    public static function plus(Expr $expr): Unary
    {
        return new self($expr, self::OP_PLUS);
    }

    public static function minus(Expr $expr): Unary
    {
        return new self($expr, self::OP_MINUS);
    }

    /**
     * @return Expr
     */
    public function getExpr(): Expr
    {
        return $this->expr;
    }

    /**
     * @return string
     */
    public function getOperator(): string
    {
        return $this->operator;
    }
}