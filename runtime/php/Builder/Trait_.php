declare (strict_types=1);
namespace P2Any\PhpParser\Builder;

use P2Any\PhpParser;
use P2Any\PhpParser\BuilderHelpers;
use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Stmt;
class Trait_ extends \P2Any\PhpParser\Builder\Declaration
{
    protected $name;
    protected $uses = [];
    protected $properties = [];
    protected $methods = [];
    /** @var Node\AttributeGroup[] */
    protected $attributeGroups = [];
    /**
     * Creates an interface builder.
     *
     * @param string $name Name of the interface
     */
    public function __construct(string $name)
    {
        $this->name = $name;
    }
    /**
     * Adds a statement.
     *
     * @param Stmt|PhpParser\Builder $stmt The statement to add
     *
     * @return $this The builder instance (for fluid interface)
     */
    public function addStmt($stmt)
    {
        $stmt = \P2Any\PhpParser\BuilderHelpers::normalizeNode($stmt);
        if ($stmt instanceof \P2Any\PhpParser\Node\Stmt\Property) {
            $this->properties[] = $stmt;
        } elseif ($stmt instanceof \P2Any\PhpParser\Node\Stmt\ClassMethod) {
            $this->methods[] = $stmt;
        } elseif ($stmt instanceof \P2Any\PhpParser\Node\Stmt\TraitUse) {
            $this->uses[] = $stmt;
        } else {
            throw new \LogicException(sprintf('Unexpected node of type "%s"', $stmt->getType()));
        }
        return $this;
    }
    /**
     * Adds an attribute group.
     *
     * @param Node\Attribute|Node\AttributeGroup $attribute
     *
     * @return $this The builder instance (for fluid interface)
     */
    public function addAttribute($attribute)
    {
        $this->attributeGroups[] = \P2Any\PhpParser\BuilderHelpers::normalizeAttribute($attribute);
        return $this;
    }
    /**
     * Returns the built trait node.
     *
     * @return Stmt\Trait_ The built interface node
     */
    public function getNode() : \P2Any\PhpParser\Node
    {
        return new \P2Any\PhpParser\Node\Stmt\Trait_($this->name, ['stmts' => array_merge($this->uses, $this->properties, $this->methods), 'attrGroups' => $this->attributeGroups], $this->attributes);
    }
}