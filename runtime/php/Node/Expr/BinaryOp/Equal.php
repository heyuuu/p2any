declare (strict_types=1);
namespace P2Any\PhpParser\Node\Expr\BinaryOp;

use P2Any\PhpParser\Node\Expr\BinaryOp;
class Equal extends \P2Any\PhpParser\Node\Expr\BinaryOp
{
    public function getOperatorSigil() : string
    {
        return '==';
    }
    public function getType() : string
    {
        return 'Expr_BinaryOp_Equal';
    }
}