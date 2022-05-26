<?php

declare(strict_types=1);

namespace P2Any\Fragment;

use P2Any\Fragment;

class Arg implements Fragment
{
    /** @var Expr Value to pass */
    public $value;
    /** @var bool Whether to pass by ref */
    public $byRef;
    /** @var bool Whether to unpack the argument */
    public $unpack;

    public function __construct(
        Expr $value,
        bool $byRef = false,
        bool $unpack = false
    ) {
        $this->value  = $value;
        $this->byRef  = $byRef;
        $this->unpack = $unpack;
    }
}
