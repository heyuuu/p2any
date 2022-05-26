<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;

class List_ implements Expr
{
    /** @var (ArrayItem|null)[] List of items to assign to */
    public $items;

    /**
     * Constructs a list() destructuring node.
     *
     * @param (ArrayItem|null)[] $items List of items to assign to
     */
    public function __construct(array $items)
    {
        $this->items = $items;
    }
}
