<?php

namespace P2Any\Exception;

class ExecuteException extends \RuntimeException
{
    public function __construct($message = "")
    {
        parent::__construct($message);
    }
}