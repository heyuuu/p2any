declare (strict_types=1);
namespace P2Any\PhpParser\Node\Expr\Cast;

use P2Any\PhpParser\Node\Expr\Cast;
class Object_ extends \P2Any\PhpParser\Node\Expr\Cast
{
    public function getType() : string
    {
        return 'Expr_Cast_Object';
    }
}