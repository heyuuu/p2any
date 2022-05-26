<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Cast implements Expr
{
    /** @var string */
    private $type;
    /** @var Expr Expression */
    public $expr;

    private function __construct(string $type, Expr $expr)
    {
        $this->type = $type;
        $this->expr = $expr;
    }

    const ARRAY  = 'Array';
    const BOOL   = 'Bool';
    const DOUBLE = 'Double';
    const INT    = 'Int';
    const OBJECT = 'Object';
    const STRING = 'String';
    const UNSET  = 'Unset';

    public static function array(Expr $expr): Cast
    {
        return new self(self::ARRAY, $expr);
    }

    public static function bool(Expr $expr): Cast
    {
        return new self(self::BOOL, $expr);
    }

    public static function double(Expr $expr): Cast
    {
        return new self(self::DOUBLE, $expr);
    }

    public static function int(Expr $expr): Cast
    {
        return new self(self::INT, $expr);
    }

    public static function object(Expr $expr): Cast
    {
        return new self(self::OBJECT, $expr);
    }

    public static function string(Expr $expr): Cast
    {
        return new self(self::STRING, $expr);
    }

    public static function unset(Expr $expr): Cast
    {
        return new self(self::UNSET, $expr);
    }
}
