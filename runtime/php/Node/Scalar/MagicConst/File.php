declare (strict_types=1);
namespace P2Any\PhpParser\Node\Scalar\MagicConst;

use P2Any\PhpParser\Node\Scalar\MagicConst;
class File extends \P2Any\PhpParser\Node\Scalar\MagicConst
{
    public function getName() : string
    {
        return '__FILE__';
    }
    public function getType() : string
    {
        return 'Scalar_MagicConst_File';
    }
}