<?php

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\Decl;

class ClassDecl implements Decl
{
    /**
     * @var int
     */
    private $flags;
    
    /**
     * @var string
     */
    private $name;

    public function __construct(
        int $flags,
        string $name
    ) {
        $this->flags = $flags;
        $this->name  = $name;
    }
}
