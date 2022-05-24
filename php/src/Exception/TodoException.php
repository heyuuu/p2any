<?php

namespace P2Any\Exception;

class TodoException extends \RuntimeException
{
    public function __construct($message = '')
    {
        parent::__construct($message);
    }
}
