declare (strict_types=1);
namespace P2Any\PhpParser\Builder;

use P2Any\PhpParser;
use P2Any\PhpParser\BuilderHelpers;
use P2Any\PhpParser\Node;
use P2Any\PhpParser\Node\Identifier;
use P2Any\PhpParser\Node\Stmt;
class EnumCase implements \P2Any\PhpParser\Builder
{
    protected $name;
    protected $value = null;
    protected $attributes = [];
    /** @var Node\AttributeGroup[] */
    protected $attributeGroups = [];
    /**
     * Creates an enum case builder.
     *
     * @param string|Identifier $name  Name
     */
    public function __construct($name)
    {
        $this->name = $name;
    }
    /**
     * Sets the value.
     *
     * @param Node\Expr|string|int $value
     *
     * @return $this
     */
    public function setValue($value)
    {
        $this->value = \P2Any\PhpParser\BuilderHelpers::normalizeValue($value);
        return $this;
    }
    /**
     * Sets doc comment for the constant.
     *
     * @param PhpParser\Comment\Doc|string $docComment Doc comment to set
     *
     * @return $this The builder instance (for fluid interface)
     */
    public function setDocComment($docComment)
    {
        $this->attributes = ['comments' => [\P2Any\PhpParser\BuilderHelpers::normalizeDocComment($docComment)]];
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
     * Returns the built enum case node.
     *
     * @return Stmt\EnumCase The built constant node
     */
    public function getNode() : \P2Any\PhpParser\Node
    {
        return new \P2Any\PhpParser\Node\Stmt\EnumCase($this->name, $this->value, $this->attributes, $this->attributeGroups);
    }
}