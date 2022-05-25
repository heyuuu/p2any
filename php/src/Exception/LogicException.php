<?php

namespace P2Any\Exception;

use Symfony\Component\String\Exception\RuntimeException;

class LogicException extends RuntimeException
{
    public function __construct(string $message)
    {
        parent::__construct($message);
    }
}