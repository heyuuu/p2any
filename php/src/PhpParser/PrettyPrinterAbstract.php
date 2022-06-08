<?php

declare(strict_types=1);

namespace P2Any\PhpParser;

use P2Any\PhpParser\Internal\TokenStream;
use P2Any\PhpParser\Node\Expr;
use P2Any\PhpParser\Node\Expr\AssignOp;
use P2Any\PhpParser\Node\Expr\BinaryOp;
use P2Any\PhpParser\Node\Expr\Cast;
use P2Any\PhpParser\Node\Scalar;
use P2Any\PhpParser\Node\Stmt;

abstract class PrettyPrinterAbstract
{
    protected $precedenceMap = [
        // [precedence, associativity]
        // where for precedence -1 is %left, 0 is %nonassoc and 1 is %right
        BinaryOp\Pow::class            => [0, 1],
        Expr\BitwiseNot::class         => [10, 1],
        Expr\PreInc::class             => [10, 1],
        Expr\PreDec::class             => [10, 1],
        Expr\PostInc::class            => [10, -1],
        Expr\PostDec::class            => [10, -1],
        Expr\UnaryPlus::class          => [10, 1],
        Expr\UnaryMinus::class         => [10, 1],
        Cast\Int_::class               => [10, 1],
        Cast\Double::class             => [10, 1],
        Cast\String_::class            => [10, 1],
        Cast\Array_::class             => [10, 1],
        Cast\Object_::class            => [10, 1],
        Cast\Bool_::class              => [10, 1],
        Cast\Unset_::class             => [10, 1],
        Expr\ErrorSuppress::class      => [10, 1],
        Expr\Instanceof_::class        => [20, 0],
        Expr\BooleanNot::class         => [30, 1],
        BinaryOp\Mul::class            => [40, -1],
        BinaryOp\Div::class            => [40, -1],
        BinaryOp\Mod::class            => [40, -1],
        BinaryOp\Plus::class           => [50, -1],
        BinaryOp\Minus::class          => [50, -1],
        BinaryOp\Concat::class         => [50, -1],
        BinaryOp\ShiftLeft::class      => [60, -1],
        BinaryOp\ShiftRight::class     => [60, -1],
        BinaryOp\Smaller::class        => [70, 0],
        BinaryOp\SmallerOrEqual::class => [70, 0],
        BinaryOp\Greater::class        => [70, 0],
        BinaryOp\GreaterOrEqual::class => [70, 0],
        BinaryOp\Equal::class          => [80, 0],
        BinaryOp\NotEqual::class       => [80, 0],
        BinaryOp\Identical::class      => [80, 0],
        BinaryOp\NotIdentical::class   => [80, 0],
        BinaryOp\Spaceship::class      => [80, 0],
        BinaryOp\BitwiseAnd::class     => [90, -1],
        BinaryOp\BitwiseXor::class     => [100, -1],
        BinaryOp\BitwiseOr::class      => [110, -1],
        BinaryOp\BooleanAnd::class     => [120, -1],
        BinaryOp\BooleanOr::class      => [130, -1],
        BinaryOp\Coalesce::class       => [140, 1],
        Expr\Ternary::class            => [150, 0],
        // parser uses %left for assignments, but they really behave as %right
        Expr\Assign::class             => [160, 1],
        Expr\AssignRef::class          => [160, 1],
        AssignOp\Plus::class           => [160, 1],
        AssignOp\Minus::class          => [160, 1],
        AssignOp\Mul::class            => [160, 1],
        AssignOp\Div::class            => [160, 1],
        AssignOp\Concat::class         => [160, 1],
        AssignOp\Mod::class            => [160, 1],
        AssignOp\BitwiseAnd::class     => [160, 1],
        AssignOp\BitwiseOr::class      => [160, 1],
        AssignOp\BitwiseXor::class     => [160, 1],
        AssignOp\ShiftLeft::class      => [160, 1],
        AssignOp\ShiftRight::class     => [160, 1],
        AssignOp\Pow::class            => [160, 1],
        Expr\YieldFrom::class          => [165, 1],
        Expr\Print_::class             => [168, 1],
        BinaryOp\LogicalAnd::class     => [170, -1],
        BinaryOp\LogicalXor::class     => [180, -1],
        BinaryOp\LogicalOr::class      => [190, -1],
        Expr\Include_::class           => [200, -1],
    ];

    /** @var int Current indentation level. */
    protected $indentLevel;
    /** @var string Newline including current indentation. */
    protected $nl;
    /** @var string Token placed at end of doc string to ensure it is followed by a newline. */
    protected $docStringEndToken;
    /** @var bool Whether semicolon namespaces can be used (i.e. no global namespace is used) */
    protected $canUseSemicolonNamespaces;
    /** @var array Pretty printer options */
    protected $options;

    /**
     * Creates a pretty printer instance using the given options.
     *
     * Supported options:
     *  * bool $shortArraySyntax = false: Whether to use [] instead of array() as the default array
     *                                    syntax, if the node does not specify a format.
     *
     * @param array $options Dictionary of formatting options
     */
    public function __construct(array $options = [])
    {
        $this->docStringEndToken = '_DOC_STRING_END_' . mt_rand();

        $defaultOptions = ['shortArraySyntax' => false];
        $this->options  = $options + $defaultOptions;
    }

    /**
     * Reset pretty printing state.
     */
    protected function resetState()
    {
        $this->indentLevel = 0;
        $this->nl          = "\n";
    }

    /**
     * Set indentation level
     *
     * @param int $level Level in number of spaces
     */
    protected function setIndentLevel(int $level)
    {
        $this->indentLevel = $level;
        $this->nl          = "\n" . \str_repeat(' ', $level);
    }

    /**
     * Increase indentation level.
     */
    protected function indent()
    {
        $this->indentLevel += 4;
        $this->nl          .= '    ';
    }

    /**
     * Decrease indentation level.
     */
    protected function outdent()
    {
        assert($this->indentLevel >= 4);
        $this->indentLevel -= 4;
        $this->nl          = "\n" . str_repeat(' ', $this->indentLevel);
    }

    /**
     * Pretty prints an array of statements.
     *
     * @param Node[] $stmts Array of statements
     *
     * @return string Pretty printed statements
     */
    public function prettyPrint(array $stmts): string
    {
        $this->resetState();
        $this->preprocessNodes($stmts);

        return ltrim($this->handleMagicTokens($this->pStmts($stmts, false)));
    }

    /**
     * Pretty prints an expression.
     *
     * @param Expr $node Expression node
     *
     * @return string Pretty printed node
     */
    public function prettyPrintExpr(Expr $node): string
    {
        $this->resetState();
        return $this->handleMagicTokens($this->p($node));
    }

    /**
     * Pretty prints a file of statements (includes the opening <?php tag if it is required).
     *
     * @param Node[] $stmts Array of statements
     *
     * @return string Pretty printed statements
     */
    public function prettyPrintFile(array $stmts): string
    {
        if (!$stmts) {
            return "<?php\n\n";
        }

        $p = "<?php\n\n" . $this->prettyPrint($stmts);

        if ($stmts[0] instanceof Stmt\InlineHTML) {
            $p = preg_replace('/^<\?php\s+\?>\n?/', '', $p);
        }
        if ($stmts[count($stmts) - 1] instanceof Stmt\InlineHTML) {
            $p = preg_replace('/<\?php$/', '', rtrim($p));
        }

        return $p;
    }

    /**
     * Preprocesses the top-level nodes to initialize pretty printer state.
     *
     * @param Node[] $nodes Array of nodes
     */
    protected function preprocessNodes(array $nodes)
    {
        /* We can use semicolon-namespaces unless there is a global namespace declaration */
        $this->canUseSemicolonNamespaces = true;
        foreach ($nodes as $node) {
            if ($node instanceof Stmt\Namespace_ && null === $node->name) {
                $this->canUseSemicolonNamespaces = false;
                break;
            }
        }
    }

    /**
     * Handles (and removes) no-indent and doc-string-end tokens.
     *
     * @param string $str
     *
     * @return string
     */
    protected function handleMagicTokens(string $str): string
    {
        // Replace doc-string-end tokens with nothing or a newline
        $str = str_replace($this->docStringEndToken . ";\n", ";\n", $str);
        $str = str_replace($this->docStringEndToken, "\n", $str);

        return $str;
    }

    /**
     * Pretty prints an array of nodes (statements) and indents them optionally.
     *
     * @param Node[] $nodes  Array of nodes
     * @param bool   $indent Whether to indent the printed nodes
     *
     * @return string Pretty printed statements
     */
    protected function pStmts(array $nodes, bool $indent = true): string
    {
        if ($indent) {
            $this->indent();
        }

        $result = '';
        foreach ($nodes as $node) {
            $comments = $node->getComments();
            if ($comments) {
                $result .= $this->nl . $this->pComments($comments);
                if ($node instanceof Stmt\Nop) {
                    continue;
                }
            }

            $result .= $this->nl . $this->p($node);
        }

        if ($indent) {
            $this->outdent();
        }

        return $result;
    }

    /**
     * Pretty-print an infix operation while taking precedence into account.
     *
     * @param string $class          Node class of operator
     * @param Node   $leftNode       Left-hand side node
     * @param string $operatorString String representation of the operator
     * @param Node   $rightNode      Right-hand side node
     *
     * @return string Pretty printed infix operation
     */
    protected function pInfixOp(string $class, Node $leftNode, string $operatorString, Node $rightNode): string
    {
        [$precedence, $associativity] = $this->precedenceMap[$class];

        return $this->pPrec($leftNode, $precedence, $associativity, -1)
            . $operatorString
            . $this->pPrec($rightNode, $precedence, $associativity, 1);
    }

    /**
     * Pretty-print a prefix operation while taking precedence into account.
     *
     * @param string $class          Node class of operator
     * @param string $operatorString String representation of the operator
     * @param Node   $node           Node
     *
     * @return string Pretty printed prefix operation
     */
    protected function pPrefixOp(string $class, string $operatorString, Node $node): string
    {
        [$precedence, $associativity] = $this->precedenceMap[$class];
        return $operatorString . $this->pPrec($node, $precedence, $associativity, 1);
    }

    /**
     * Pretty-print a postfix operation while taking precedence into account.
     *
     * @param string $class          Node class of operator
     * @param string $operatorString String representation of the operator
     * @param Node   $node           Node
     *
     * @return string Pretty printed postfix operation
     */
    protected function pPostfixOp(string $class, Node $node, string $operatorString): string
    {
        [$precedence, $associativity] = $this->precedenceMap[$class];
        return $this->pPrec($node, $precedence, $associativity, -1) . $operatorString;
    }

    /**
     * Prints an expression node with the least amount of parentheses necessary to preserve the meaning.
     *
     * @param Node $node                Node to pretty print
     * @param int  $parentPrecedence    Precedence of the parent operator
     * @param int  $parentAssociativity Associativity of parent operator
     *                                  (-1 is left, 0 is nonassoc, 1 is right)
     * @param int  $childPosition       Position of the node relative to the operator
     *                                  (-1 is left, 1 is right)
     *
     * @return string The pretty printed node
     */
    protected function pPrec(Node $node, int $parentPrecedence, int $parentAssociativity, int $childPosition): string
    {
        $class = \get_class($node);
        if (isset($this->precedenceMap[$class])) {
            $childPrecedence = $this->precedenceMap[$class][0];
            if ($childPrecedence > $parentPrecedence
                || ($parentPrecedence === $childPrecedence && $parentAssociativity !== $childPosition)
            ) {
                return '(' . $this->p($node) . ')';
            }
        }

        return $this->p($node);
    }

    /**
     * Pretty prints an array of nodes and implodes the printed values.
     *
     * @param Node[] $nodes Array of Nodes to be printed
     * @param string $glue  Character to implode with
     *
     * @return string Imploded pretty printed nodes
     */
    protected function pImplode(array $nodes, string $glue = ''): string
    {
        $pNodes = [];
        foreach ($nodes as $node) {
            if (null === $node) {
                $pNodes[] = '';
            } else {
                $pNodes[] = $this->p($node);
            }
        }

        return implode($glue, $pNodes);
    }

    /**
     * Pretty prints an array of nodes and implodes the printed values with commas.
     *
     * @param Node[] $nodes Array of Nodes to be printed
     *
     * @return string Comma separated pretty printed nodes
     */
    protected function pCommaSeparated(array $nodes): string
    {
        return $this->pImplode($nodes, ', ');
    }

    /**
     * Pretty prints a comma-separated list of nodes in multiline style, including comments.
     *
     * The result includes a leading newline and one level of indentation (same as pStmts).
     *
     * @param Node[] $nodes         Array of Nodes to be printed
     * @param bool   $trailingComma Whether to use a trailing comma
     *
     * @return string Comma separated pretty printed nodes in multiline style
     */
    protected function pCommaSeparatedMultiline(array $nodes, bool $trailingComma): string
    {
        $this->indent();

        $result  = '';
        $lastIdx = count($nodes) - 1;
        foreach ($nodes as $idx => $node) {
            if ($node !== null) {
                $comments = $node->getComments();
                if ($comments) {
                    $result .= $this->nl . $this->pComments($comments);
                }

                $result .= $this->nl . $this->p($node);
            } else {
                $result .= $this->nl;
            }
            if ($trailingComma || $idx !== $lastIdx) {
                $result .= ',';
            }
        }

        $this->outdent();
        return $result;
    }

    /**
     * Prints reformatted text of the passed comments.
     *
     * @param Comment[] $comments List of comments
     *
     * @return string Reformatted text of comments
     */
    protected function pComments(array $comments): string
    {
        $formattedComments = [];

        foreach ($comments as $comment) {
            $formattedComments[] = str_replace("\n", $this->nl, $comment->getReformattedText());
        }

        return implode($this->nl, $formattedComments);
    }

    /**
     * Pretty prints a node.
     *
     * This method also handles formatting preservation for nodes.
     *
     * @param Node $node Node to be pretty printed
     *
     * @return string Pretty printed node
     */
    protected function p(Node $node): string
    {
        return $this->{'p' . $node->getType()}($node);
    }

    /**
     * Determines whether the LHS of a call must be wrapped in parenthesis.
     *
     * @param Node $node LHS of a call
     *
     * @return bool Whether parentheses are required
     */
    protected function callLhsRequiresParens(Node $node): bool
    {
        return !($node instanceof Node\Name
            || $node instanceof Expr\Variable
            || $node instanceof Expr\ArrayDimFetch
            || $node instanceof Expr\FuncCall
            || $node instanceof Expr\MethodCall
            || $node instanceof Expr\StaticCall
            || $node instanceof Expr\Array_);
    }

    /**
     * Determines whether the LHS of a dereferencing operation must be wrapped in parenthesis.
     *
     * @param Node $node LHS of dereferencing operation
     *
     * @return bool Whether parentheses are required
     */
    protected function dereferenceLhsRequiresParens(Node $node): bool
    {
        return !($node instanceof Expr\Variable
            || $node instanceof Node\Name
            || $node instanceof Expr\ArrayDimFetch
            || $node instanceof Expr\PropertyFetch
            || $node instanceof Expr\StaticPropertyFetch
            || $node instanceof Expr\FuncCall
            || $node instanceof Expr\MethodCall
            || $node instanceof Expr\StaticCall
            || $node instanceof Expr\Array_
            || $node instanceof Scalar\String_
            || $node instanceof Expr\ConstFetch
            || $node instanceof Expr\ClassConstFetch);
    }

    /**
     * Print modifiers, including trailing whitespace.
     *
     * @param int $modifiers Modifier mask to print
     *
     * @return string Printed modifiers
     */
    protected function pModifiers(int $modifiers)
    {
        return ($modifiers & Stmt\Class_::MODIFIER_PUBLIC ? 'public ' : '')
            . ($modifiers & Stmt\Class_::MODIFIER_PROTECTED ? 'protected ' : '')
            . ($modifiers & Stmt\Class_::MODIFIER_PRIVATE ? 'private ' : '')
            . ($modifiers & Stmt\Class_::MODIFIER_STATIC ? 'static ' : '')
            . ($modifiers & Stmt\Class_::MODIFIER_ABSTRACT ? 'abstract ' : '')
            . ($modifiers & Stmt\Class_::MODIFIER_FINAL ? 'final ' : '');
    }
}
