declare (strict_types=1);
namespace P2Any\PhpParser\Node\Stmt;

use P2Any\PhpParser\Node;
/** Nop/empty statement (;). */
class Nop extends \P2Any\PhpParser\Node\Stmt
{
    public function getSubNodeNames() : array
    {
        return [];
    }
    public function getType() : string
    {
        return 'Stmt_Nop';
    }
}