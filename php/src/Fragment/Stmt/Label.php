<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Identifier;
use P2Any\Fragment\Stmt;

class Label implements Stmt
{
    /** @var Identifier Name */
    public $name;

    public function __construct(Identifier $name)
    {
        $this->name = $name;
    }
}
