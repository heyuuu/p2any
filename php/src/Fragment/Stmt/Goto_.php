<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Identifier;
use P2Any\Fragment\Stmt;

class Goto_ implements Stmt
{
    /** @var Identifier Name of label to jump to */
    public $name;

    public function __construct(Identifier $name)
    {
        $this->name = $name;
    }
}
