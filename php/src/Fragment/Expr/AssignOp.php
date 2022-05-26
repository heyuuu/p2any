<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class AssignOp implements Expr
{
    /** @var string */
    private $operator;
    /** @var Expr Variable */
    private $var;
    /** @var Expr Expression */
    private $expr;

    private function __construct(string $operator, Expr $var, Expr $expr)
    {
        $this->var      = $var;
        $this->expr     = $expr;
        $this->operator = $operator;
    }

    const BITWISE_AND = 'BitwiseAnd';
    const BITWISE_OR  = 'BitwiseOr';
    const BITWISE_XOR = 'BitwiseXor';
    const CONCAT      = 'Concat';
    const DIV         = 'Div';
    const MINUS       = 'Minus';
    const MOD         = 'Mod';
    const MUL         = 'Mul';
    const PLUS        = 'Plus';
    const POW         = 'Pow';
    const SHIFT_LEFT  = 'ShiftLeft';
    const SHIFT_RIGHT = 'ShiftRight';

    public static function BitwiseAnd(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::BITWISE_AND, $var, $expr);
    }

    public static function BitwiseOr(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::BITWISE_OR, $var, $expr);
    }

    public static function BitwiseXor(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::BITWISE_XOR, $var, $expr);
    }

    public static function Concat(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::CONCAT, $var, $expr);
    }

    public static function Div(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::DIV, $var, $expr);
    }

    public static function Minus(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::MINUS, $var, $expr);
    }

    public static function Mod(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::MOD, $var, $expr);
    }

    public static function Mul(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::MUL, $var, $expr);
    }

    public static function Plus(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::PLUS, $var, $expr);
    }

    public static function Pow(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::POW, $var, $expr);
    }

    public static function ShiftLeft(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::SHIFT_LEFT, $var, $expr);
    }

    public static function ShiftRight(Expr $var, Expr $expr): AssignOp
    {
        return new self(self::SHIFT_RIGHT, $var, $expr);
    }
}
