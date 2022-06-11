<?php

namespace P2Any\Utils;

use Symfony\Component\Finder\Finder;

class PhpFileFinder extends Finder
{
    public function __construct(string $root)
    {
        parent::__construct();

        $this->in($root)->files()->name('*.php');
    }
}
