<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\Stmt;

class ClassConst implements Stmt
{
    /** @var int Modifiers */
    public $flags;
    /** @var Node\Const_[] Constant declarations */
    public $consts;

    /**
     * Constructs a class const list node.
     *
     * @param Node\Const_[] $consts Constant declarations
     * @param int           $flags  Modifiers
     */
    public function __construct(array $consts, int $flags = 0)
    {
        $this->flags  = $flags;
        $this->consts = $consts;
    }

    /**
     * Whether constant is explicitly or implicitly public.
     *
     * @return bool
     */
    public function isPublic(): bool
    {
        return ($this->flags & Class_::MODIFIER_PUBLIC) !== 0
            || ($this->flags & Class_::VISIBILITY_MODIFIER_MASK) === 0;
    }

    /**
     * Whether constant is protected.
     *
     * @return bool
     */
    public function isProtected(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_PROTECTED);
    }

    /**
     * Whether constant is private.
     *
     * @return bool
     */
    public function isPrivate(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_PRIVATE);
    }

    /**
     * Whether constant is final.
     *
     * @return bool
     */
    public function isFinal(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_FINAL);
    }
}
