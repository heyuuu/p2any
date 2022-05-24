declare (strict_types=1);
namespace P2Any\PhpParser\Node\Expr\AssignOp;

use P2Any\PhpParser\Node\Expr\AssignOp;
class Concat extends \P2Any\PhpParser\Node\Expr\AssignOp
{
    public function getType() : string
    {
        return 'Expr_AssignOp_Concat';
    }
}