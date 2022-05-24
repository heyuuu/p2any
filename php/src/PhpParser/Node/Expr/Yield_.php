<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr;

use P2Any\PhpParser\Node\Expr;

class Yield_ extends Expr
{
    /** @var Expr|null Key expression */
    public $key;
    /** @var Expr|null Value expression */
    public $value;

    /**
     * Constructs a yield expression node.
     *
     * @param Expr|null $value      Value expression
     * @param Expr|null $key        Key expression
     * @param array     $attributes Additional attributes
     */
    public function __construct(Expr $value = null, Expr $key = null, array $attributes = [])
    {
        $this->attributes = $attributes;
        $this->key        = $key;
        $this->value      = $value;
    }

    public function getSubNodeNames(): array
    {
        return ['key', 'value'];
    }

    public function getType(): string
    {
        return 'Expr_Yield';
    }
}
