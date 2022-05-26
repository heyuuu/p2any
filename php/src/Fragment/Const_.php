<?php

declare(strict_types=1);

namespace P2Any\Fragment;

use P2Any\Fragment;

class Const_ implements Fragment
{
    /** @var string Name */
    public $name;
    /** @var Expr Value */
    public $value;

    public function __construct(string $name, Expr $value)
    {
        $this->name  = $name;
        $this->value = $value;
    }
}
