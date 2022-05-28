<?php

namespace P2Any\Service\NodeTransformer;

use Webmozart\Assert\Assert;

class Context
{
    /**
     * @var string
     */
    private $file;
    /**
     * @var string
     */
    private $namespace = '';
    /**
     * @var string
     */
    private $class = '';
    /**
     * @var string
     */
    private $trait = '';
    /**
     * @var string
     */
    private $method = '';
    /**
     * @var string
     */
    private $function = '';

    public function __construct(string $filepath)
    {
        $this->file = $filepath;
    }

    public function enterNamespace(string $namespace)
    {
        Assert::isEmpty($this->namespace);
        Assert::isEmpty($this->class);
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        $this->namespace = $namespace;
    }

    public function leaveNamespace(string $namespace)
    {
        Assert::isEmpty($this->class);
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        Assert::eq($namespace, $this->namespace);
        $this->namespace = '';
    }

    public function enterClass(string $class)
    {
        Assert::isEmpty($this->class);
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        $this->class = $class;
    }

    public function leaveClass(string $class)
    {
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        Assert::eq($class, $this->class);

        $this->class = '';
    }

    public function enterMethod(string $method)
    {
        Assert::notEmpty($this->class);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        $this->method = $method;
    }

    public function leaveMethod(string $method)
    {
        Assert::notEmpty($this->class);
        Assert::notEmpty($this->method);
        Assert::isEmpty($this->function);

        Assert::eq($method, $this->method);

        $this->method = '';
    }

    public function enterFunction(string $function)
    {
        Assert::isEmpty($this->class);
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        $this->function = $function;
    }

    public function leaveFunction(string $function)
    {
        Assert::isEmpty($this->class);
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::notEmpty($this->function);

        Assert::eq($function, $this->function);

        $this->function = '';
    }

    public function enterTrait(string $trait)
    {
        Assert::notEmpty($this->class);
        Assert::isEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        $this->trait = $trait;
    }

    public function leaveTrait(string $trait)
    {
        Assert::notEmpty($this->class);
        Assert::notEmpty($this->trait);
        Assert::isEmpty($this->method);
        Assert::isEmpty($this->function);

        Assert::eq($trait, $this->trait);

        $this->trait = $trait;
    }

    /**
     * @return string
     */
    public function getFile(): string
    {
        return $this->file;
    }

    /**
     * @return string
     */
    public function getNamespace(): string
    {
        return $this->namespace;
    }

    /**
     * @return string
     */
    public function getClass(): string
    {
        return $this->class;
    }

    /**
     * @return string
     */
    public function getMethod(): string
    {
        return $this->method;
    }

    /**
     * @return string
     */
    public function getFunction(): string
    {
        return $this->function;
    }

    /**
     * @return string
     */
    public function getTrait(): string
    {
        return $this->trait;
    }
}