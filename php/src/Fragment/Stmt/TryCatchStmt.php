<?php

declare(strict_types=1);

namespace P2Any\Fragment\Stmt;

use P2Any\Fragment\Stmt;
use P2Any\Fragment\StmtList;
use Webmozart\Assert\Assert;

class TryCatchStmt implements Stmt
{
    /** @var StmtList Statements */
    public $stmts;
    /** @var CatchBranch[] Catches */
    public $catches;
    /** @var StmtList|null Optional finally node */
    public $finally;

    /**
     * Constructs a try catch node.
     *
     * @param StmtList      $stmts   Statements
     * @param CatchBranch[] $catches Catches
     * @param StmtList|null $finally
     */
    public function __construct(StmtList $stmts, array $catches, ?StmtList $finally = null)
    {
        Assert::allIsInstanceOf($catches, CatchBranch::class);

        $this->stmts   = $stmts;
        $this->catches = $catches;
        $this->finally = $finally;
    }
}
