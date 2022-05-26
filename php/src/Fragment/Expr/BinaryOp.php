<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class BinaryOp implements Expr
{
    /** @var string */
    private $operator;
    /** @var Expr The left hand side expression */
    private $left;
    /** @var Expr The right hand side expression */
    private $right;

    private function __construct(string $operator, Expr $left, Expr $right)
    {
        $this->operator = $operator;
        $this->left     = $left;
        $this->right    = $right;
    }

    const BITWISE_AND      = '&';
    const BITWISE_OR       = '|';
    const BITWISE_XOR      = '^';
    const BOOLEAN_AND      = '&&';
    const BOOLEAN_OR       = '||';
    const COALESCE         = '??';
    const CONCAT           = '.';
    const DIV              = '/';
    const EQUAL            = '==';
    const GREATER          = '>';
    const GREATER_OR_EQUAL = '>=';
    const IDENTICAL        = '===';
    const LOGICAL_AND      = 'and';
    const LOGICAL_OR       = 'or';
    const LOGICAL_XOR      = 'xor';
    const MINUS            = '-';
    const MOD              = '%';
    const MUL              = '*';
    const NOT_EQUAL        = '!=';
    const NOT_IDENTICAL    = '!==';
    const PLUS             = '+';
    const POW              = '**';
    const SHIFT_LEFT       = '<<';
    const SHIFT_RIGHT      = '>>';
    const SMALLER          = '<';
    const SMALLER_OR_EQUAL = '<=';
    const SPACESHIP        = '<=>';

    public static function BitwiseAnd(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::BITWISE_AND, $left, $right);
    }

    public static function BitwiseOr(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::BITWISE_OR, $left, $right);
    }

    public static function BitwiseXor(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::BITWISE_XOR, $left, $right);
    }

    public static function BooleanAnd(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::BOOLEAN_AND, $left, $right);
    }

    public static function BooleanOr(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::BOOLEAN_OR, $left, $right);
    }

    public static function Coalesce(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::COALESCE, $left, $right);
    }

    public static function Concat(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::CONCAT, $left, $right);
    }

    public static function Div(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::DIV, $left, $right);
    }

    public static function Equal(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::EQUAL, $left, $right);
    }

    public static function Greater(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::GREATER, $left, $right);
    }

    public static function GreaterOrEqual(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::GREATER_OR_EQUAL, $left, $right);
    }

    public static function Identical(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::IDENTICAL, $left, $right);
    }

    public static function LogicalAnd(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::LOGICAL_AND, $left, $right);
    }

    public static function LogicalOr(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::LOGICAL_OR, $left, $right);
    }

    public static function LogicalXor(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::LOGICAL_XOR, $left, $right);
    }

    public static function Minus(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::MINUS, $left, $right);
    }

    public static function Mod(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::MOD, $left, $right);
    }

    public static function Mul(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::MUL, $left, $right);
    }

    public static function NotEqual(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::NOT_EQUAL, $left, $right);
    }

    public static function NotIdentical(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::NOT_IDENTICAL, $left, $right);
    }

    public static function Plus(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::PLUS, $left, $right);
    }

    public static function Pow(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::POW, $left, $right);
    }

    public static function ShiftLeft(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::SHIFT_LEFT, $left, $right);
    }

    public static function ShiftRight(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::SHIFT_RIGHT, $left, $right);
    }

    public static function Smaller(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::SMALLER, $left, $right);
    }

    public static function SmallerOrEqual(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::SMALLER_OR_EQUAL, $left, $right);
    }

    public static function Spaceship(Expr $left, Expr $right): BinaryOp
    {
        return new self(self::SPACESHIP, $left, $right);
    }
}
