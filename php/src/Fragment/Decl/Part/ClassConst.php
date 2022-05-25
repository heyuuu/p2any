<?php

namespace P2Any\Fragment\Decl\Part;

use P2Any\Fragment\Expr;
use P2Any\PhpParser\Node\Identifier;

class ClassConst
{
    /**
     * @var int
     */
    private $flags;

    /**
     * @var Identifier
     */
    private $name;

    /**
     * @var Expr
     */
    private $value;

    public function __construct(
        int $flags,
        Identifier $name,
        Expr $value
    ) {
        $this->flags = $flags;
        $this->name  = $name;
        $this->value = $value;
    }

    /**
     * @return int
     */
    public function getFlags(): int
    {
        return $this->flags;
    }

    /**
     * @return Identifier
     */
    public function getName(): Identifier
    {
        return $this->name;
    }

    /**
     * @return Expr
     */
    public function getValue(): Expr
    {
        return $this->value;
    }
}