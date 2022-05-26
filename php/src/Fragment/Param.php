<?php

declare(strict_types=1);

namespace P2Any\Fragment;

use P2Any\Fragment;

class Param implements Fragment
{
    /** @var Identifier Parameter variable */
    public $name;
    /** @var TypeHint|null Type declaration */
    public $type;
    /** @var bool Whether parameter is passed by reference */
    public $byRef;
    /** @var bool Whether this is a variadic argument */
    public $variadic;
    /** @var Expr|null Default value */
    public $default;

    public function __construct(
        Identifier $name,
        TypeHint $type = null,
        Expr $default = null,
        bool $byRef = false,
        bool $variadic = false
    ) {
        $this->name     = $name;
        $this->type     = $type;
        $this->default  = $default;
        $this->byRef    = $byRef;
        $this->variadic = $variadic;
    }
}
