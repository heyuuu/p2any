<?php

namespace P2Any\Fragment\Decl;

use P2Any\Fragment\Decl;

class InterfaceDecl implements Decl
{
    /**
     * @var string
     */
    private $name;

    public function __construct(string $name)
    {
        $this->name = $name;
    }
}
