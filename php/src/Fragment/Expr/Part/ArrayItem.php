<?php

namespace P2Any\Fragment\Expr\Part;

use P2Any\Fragment\Expr;

class ArrayItem
{
    /** @var Expr|null Key */
    public $key;
    /** @var Expr Value */
    public $value;
    /** @var bool Whether to assign by reference */
    public $byRef;
    /** @var bool Whether to unpack the argument */
    public $unpack;

    public function __construct(
        ?Expr $key,
        Expr $value,
        bool $byRef = false,
        bool $unpack = false
    ) {
        $this->key    = $key;
        $this->value  = $value;
        $this->byRef  = $byRef;
        $this->unpack = $unpack;
    }

}