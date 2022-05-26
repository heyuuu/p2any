<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class ArrayItem implements Expr
{
    /** @var Expr|null Key */
    public $key;
    /** @var Expr Value */
    public $value;
    /** @var bool Whether to assign by reference */
    public $byRef;
    /** @var bool Whether to unpack the argument */
    public $unpack;

    /**
     * Constructs an array item node.
     *
     * @param Expr      $value Value
     * @param Expr|null $key   Key
     * @param bool      $byRef Whether to assign by reference
     */
    public function __construct(Expr $value, Expr $key = null, bool $byRef = false, bool $unpack = false)
    {
        $this->key    = $key;
        $this->value  = $value;
        $this->byRef  = $byRef;
        $this->unpack = $unpack;
    }
}
