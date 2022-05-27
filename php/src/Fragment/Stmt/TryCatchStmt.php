<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt;
use Webmozart\Assert\Assert;

class TryCatchStmt implements Stmt
{
    /** @var Stmt[] Statements */
    public $stmts;
    /** @var CatchBranch[] Catches */
    public $catches;
    /** @var Stmt[]|null Optional finally node */
    public $finally;

    /**
     * Constructs a try catch node.
     *
     * @param Stmt[]        $stmts   Statements
     * @param CatchBranch[] $catches Catches
     * @param Stmt[]|null   $finally
     */
    public function __construct(array $stmts, array $catches, ?array $finally = null)
    {
        Assert::allIsInstanceOf($stmts, Stmt::class);
        Assert::allIsInstanceOf($catches, CatchBranch::class);
        if ($finally !== null) {
            Assert::allIsInstanceOf($finally, Stmt::class);
        }

        $this->stmts   = $stmts;
        $this->catches = $catches;
        $this->finally = $finally;
    }
}
