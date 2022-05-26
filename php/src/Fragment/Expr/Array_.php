<?php

declare(strict_types=1);

namespace P2Any\Fragment\Expr;

use P2Any\Fragment\Expr;
use Webmozart\Assert\Assert;

class Array_ implements Expr
{
    /** @var Expr\Part\ArrayItem[] Items */
    public $items;

    public function __construct(array $items = [])
    {
        Assert::allIsInstanceOf($items, Expr\Part\ArrayItem::class);
        $this->items = $items;
    }
}
