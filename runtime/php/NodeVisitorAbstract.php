declare (strict_types=1);
namespace P2Any\PhpParser;

/**
 * @codeCoverageIgnore
 */
class NodeVisitorAbstract implements \P2Any\PhpParser\NodeVisitor
{
    public function beforeTraverse(array $nodes)
    {
        return null;
    }
    public function enterNode(\P2Any\PhpParser\Node $node)
    {
        return null;
    }
    public function leaveNode(\P2Any\PhpParser\Node $node)
    {
        return null;
    }
    public function afterTraverse(array $nodes)
    {
        return null;
    }
}