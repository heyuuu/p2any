<?php

declare(strict_types=1);

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\FunctionLike;
use P2Any\Fragment\Stmt;
use P2Any\Fragment\TypeHint;

class ClassMethod implements Stmt, FunctionLike
{
    /** @var string Name */
    public $name;
    /** @var int Flags */
    public $flags;
    /** @var bool Whether to return by reference */
    public $byRef;
    /** @var Node\Param[] Parameters */
    public $params;
    /** @var TypeHint|null Return type */
    public $returnType;
    /** @var Node\Stmt[]|null Statements */
    public $stmts;

    private static $magicNames = [
        '__construct'  => true,
        '__destruct'   => true,
        '__call'       => true,
        '__callstatic' => true,
        '__get'        => true,
        '__set'        => true,
        '__isset'      => true,
        '__unset'      => true,
        '__sleep'      => true,
        '__wakeup'     => true,
        '__tostring'   => true,
        '__set_state'  => true,
        '__clone'      => true,
        '__invoke'     => true,
        '__debuginfo'  => true,
    ];

    public function __construct(
        string $name,
        int $flags,
        bool $byRef,
        array $params,
        TypeHint $returnType,
        array $stmts
    ) {
        $this->name       = $name;
        $this->flags      = $flags;
        $this->byRef      = $byRef;
        $this->params     = $params;
        $this->returnType = $returnType;
        $this->stmts      = $stmts;
    }

    public function returnsByRef(): bool
    {
        return $this->byRef;
    }

    public function getParams(): array
    {
        return $this->params;
    }

    public function getReturnType(): ?TypeHint
    {
        return $this->returnType;
    }

    public function getStmts()
    {
        return $this->stmts;
    }

    /**
     * Whether the method is explicitly or implicitly public.
     *
     * @return bool
     */
    public function isPublic(): bool
    {
        return ($this->flags & Class_::MODIFIER_PUBLIC) !== 0
            || ($this->flags & Class_::VISIBILITY_MODIFIER_MASK) === 0;
    }

    /**
     * Whether the method is protected.
     *
     * @return bool
     */
    public function isProtected(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_PROTECTED);
    }

    /**
     * Whether the method is private.
     *
     * @return bool
     */
    public function isPrivate(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_PRIVATE);
    }

    /**
     * Whether the method is abstract.
     *
     * @return bool
     */
    public function isAbstract(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_ABSTRACT);
    }

    /**
     * Whether the method is final.
     *
     * @return bool
     */
    public function isFinal(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_FINAL);
    }

    /**
     * Whether the method is static.
     *
     * @return bool
     */
    public function isStatic(): bool
    {
        return (bool)($this->flags & Class_::MODIFIER_STATIC);
    }

    /**
     * Whether the method is magic.
     *
     * @return bool
     */
    public function isMagic(): bool
    {
        return isset(self::$magicNames[$this->name->toLowerString()]);
    }
}
