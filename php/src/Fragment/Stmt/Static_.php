<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt;

class Static_ implements Stmt
{
    /** @var StaticVar[] Variable definitions */
    public $vars;

    /**
     * Constructs a static variables list node.
     *
     * @param StaticVar[] $vars Variable definitions
     */
    public function __construct(array $vars)
    {
        $this->vars       = $vars;
    }
}
