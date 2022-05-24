<?php

namespace P2Any\Service\NodeTransformer;

use P2Any\Fragment;
use Webmozart\Assert\Assert;

class TempListFragment implements ParsingFragment
{
    /**
     * @var Fragment[]
     */
    protected $fragments;

    public function add(Fragment $fragment)
    {
        Assert::notInstanceOf($fragment, TempListFragment::class);
        $this->fragments[] = $fragment;
    }

    /**
     * @return Fragment[]
     */
    public function getFragments(): array
    {
        return $this->fragments;
    }
}
