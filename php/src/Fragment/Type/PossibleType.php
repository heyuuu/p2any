<?php

namespace P2Any\Fragment\Type;

use P2Any\Fragment\Type;

class PossibleType implements Type
{
    private $null       = true;
    private $int        = true;
    private $float      = true;
    private $string     = true;
    private $object     = true;
    private $resource   = true;
    private $classes    = null;
    private $extends    = null;
    private $super      = null;
    private $implements = null;
}