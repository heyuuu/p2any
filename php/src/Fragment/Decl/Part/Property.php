<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl\Part;

use P2Any\Fragment\Expr;
use P2Any\Fragment\Identifier;

class Property
{
    /** @var int Modifiers */
    public $flags;
    /** @var Identifier Name */
    public $name;
    /** @var Expr|null */
    public $default;

    /**
     * @param int        $flags
     * @param Identifier $name
     * @param Expr|null  $default
     */
    public function __construct(int $flags, Identifier $name, ?Expr $default)
    {
        $this->flags   = $flags;
        $this->name    = $name;
        $this->default = $default;
    }
}
