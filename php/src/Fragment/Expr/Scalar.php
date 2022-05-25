<?php

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class Scalar implements Expr
{
    const TYPE_NULL   = 1;
    const TYPE_BOOL   = 2;
    const TYPE_INT    = 3;
    const TYPE_FLOAT  = 4;
    const TYPE_STRING = 5;

    private $type;
    private $value;

    private function __construct(int $type, $value)
    {
        $this->type  = $type;
        $this->value = $value;
    }

    public static function null(): Scalar
    {
        return new Scalar(self::TYPE_NULL, null);
    }

    public static function bool(bool $value): Scalar
    {
        return new Scalar(self::TYPE_BOOL, $value);
    }

    public static function int(int $value): Scalar
    {
        return new Scalar(self::TYPE_INT, $value);
    }

    public static function float(float $value): Scalar
    {
        return new Scalar(self::TYPE_FLOAT, $value);
    }

    public static function string(string $value): Scalar
    {
        return new Scalar(self::TYPE_STRING, $value);
    }
}