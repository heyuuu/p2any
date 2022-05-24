<?php

declare(strict_types=1);

namespace P2Any\PhpParser\Node\Expr\BinaryOp;

use P2Any\PhpParser\Node\Expr\BinaryOp;

class LogicalXor extends BinaryOp
{
    public function getOperatorSigil(): string
    {
        return 'xor';
    }

    public function getType(): string
    {
        return 'Expr_BinaryOp_LogicalXor';
    }
}
