<?php

namespace P2Any\Exception;

use P2Any\PhpParser\Node;
use P2Any\Utils\ParserUtil;

class TodoException extends \RuntimeException
{
    public function __construct($message = '', Node $node = null)
    {
        parent::__construct($message);

        echo ParserUtil::prettyPrint([$node]);
    }
}
