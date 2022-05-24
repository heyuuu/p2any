<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node;

use P2Any\PhpParser\NodeAbstract;

class Param extends NodeAbstract
{
    /** @var Identifier|Name|ComplexType|null Type declaration */
    public $type;
    /** @var bool Whether parameter is passed by reference */
    public $byRef;
    /** @var bool Whether this is a variadic argument */
    public $variadic;
    /** @var Expr\Variable|Expr\Error Parameter variable */
    public $var;
    /** @var Expr|null Default value */
    public $default;

    /**
     * Constructs a parameter node.
     *
     * @param Expr\Variable|Expr\Error                $var        Parameter variable
     * @param Expr|null                               $default    Default value
     * @param string|Identifier|Name|ComplexType|null $type       Type declaration
     * @param bool                                    $byRef      Whether is passed by reference
     * @param bool                                    $variadic   Whether this is a variadic argument
     * @param array                                   $attributes Additional attributes
     * @param int                                     $flags      Optional visibility flags
     */
    public function __construct(
        $var,
        Expr $default = null,
        $type = null,
        bool $byRef = false,
        bool $variadic = false,
        array $attributes = []
    ) {
        $this->attributes = $attributes;
        $this->type       = \is_string($type) ? new Identifier($type) : $type;
        $this->byRef      = $byRef;
        $this->variadic   = $variadic;
        $this->var        = $var;
        $this->default    = $default;
    }

    public function getSubNodeNames(): array
    {
        return ['type', 'byRef', 'variadic', 'var', 'default'];
    }

    public function getType(): string
    {
        return 'Param';
    }
}
