package php.parser.node


interface Node
interface FunctionLike : Node

data class Arg(val value: Expr, val byRef: Boolean, val unpack: Boolean): Node
sealed class ComplexType(): Node
data class Const(val name: Identifier, val value: Expr, val namespacedName: Name?): Node
interface Expr: Node
data class ExprArray(val items: List<ExprArrayItem?>): Expr, Node
data class ExprArrayDimFetch(val `var`: Expr, val dim: Expr?): Expr, Node
data class ExprArrayItem(val key: Expr?, val value: Expr, val byRef: Boolean, val unpack: Boolean): Expr, Node
data class ExprAssign(val `var`: Expr, val expr: Expr): Expr, Node
sealed class ExprAssignOp(open val `var`: Expr, open val expr: Expr): Expr, Node
data class ExprAssignOpBitwiseAnd(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpBitwiseOr(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpBitwiseXor(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpConcat(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpDiv(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpMinus(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpMod(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpMul(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpPlus(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpPow(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpShiftLeft(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignOpShiftRight(override val `var`: Expr, override val expr: Expr): ExprAssignOp(`var`, expr), Node
data class ExprAssignRef(val `var`: Expr, val expr: Expr): Expr, Node
sealed class ExprBinaryOp(open val left: Expr, open val right: Expr): Expr, Node
data class ExprBinaryOpBitwiseAnd(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpBitwiseOr(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpBitwiseXor(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpBooleanAnd(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpBooleanOr(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpCoalesce(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpConcat(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpDiv(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpEqual(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpGreater(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpGreaterOrEqual(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpIdentical(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpLogicalAnd(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpLogicalOr(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpLogicalXor(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpMinus(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpMod(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpMul(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpNotEqual(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpNotIdentical(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpPlus(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpPow(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpShiftLeft(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpShiftRight(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpSmaller(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpSmallerOrEqual(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBinaryOpSpaceship(override val left: Expr, override val right: Expr): ExprBinaryOp(left, right), Node
data class ExprBitwiseNot(val expr: Expr): Expr, Node
data class ExprBooleanNot(val expr: Expr): Expr, Node
sealed class ExprCallLike(): Expr, Node
sealed class ExprCast(open val expr: Expr): Expr, Node
data class ExprCastArray(override val expr: Expr): ExprCast(expr), Node
data class ExprCastBool(override val expr: Expr): ExprCast(expr), Node
data class ExprCastDouble(override val expr: Expr): ExprCast(expr), Node
data class ExprCastInt(override val expr: Expr): ExprCast(expr), Node
data class ExprCastObject(override val expr: Expr): ExprCast(expr), Node
data class ExprCastString(override val expr: Expr): ExprCast(expr), Node
data class ExprCastUnset(override val expr: Expr): ExprCast(expr), Node
data class ExprClassConstFetch(val `class`: AnyOf2<Name, Expr>, val name: Identifier): Expr, Node
data class ExprClone(val expr: Expr): Expr, Node
data class ExprClosure(val static: Boolean, val byRef: Boolean, val params: List<Param>, val uses: List<ExprClosureUse>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>): Expr, Node, FunctionLike
data class ExprClosureUse(val `var`: ExprVariable, val byRef: Boolean): Expr, Node
data class ExprConstFetch(val name: Name): Expr, Node
data class ExprEmpty(val expr: Expr): Expr, Node
class ExprError(): Expr, Node
data class ExprErrorSuppress(val expr: Expr): Expr, Node
data class ExprEval(val expr: Expr): Expr, Node
data class ExprExit(val expr: Expr?): Expr, Node
data class ExprFuncCall(val name: AnyOf2<Name, Expr>, val args: List<Arg>): ExprCallLike(), Node
data class ExprInclude(val expr: Expr, val type: Int): Expr, Node
data class ExprInstanceof(val expr: Expr, val `class`: AnyOf2<Name, ExprVariable>): Expr, Node
data class ExprIsset(val vars: List<Expr>): Expr, Node
data class ExprList(val items: List<ExprArrayItem?>): Expr, Node
data class ExprMethodCall(val `var`: Expr, val name: AnyOf2<Identifier, Expr>, val args: List<Arg>): ExprCallLike(), Node
data class ExprNew(val `class`: AnyOf3<Name, Expr, StmtClass>, val args: List<Arg>): ExprCallLike(), Node
data class ExprPostDec(val `var`: Expr): Expr, Node
data class ExprPostInc(val `var`: Expr): Expr, Node
data class ExprPreDec(val `var`: Expr): Expr, Node
data class ExprPreInc(val `var`: Expr): Expr, Node
data class ExprPrint(val expr: Expr): Expr, Node
data class ExprPropertyFetch(val `var`: Expr, val name: AnyOf2<Identifier, Expr>): Expr, Node
data class ExprShellExec(val parts: List<Any>): Expr, Node
data class ExprStaticCall(val `class`: AnyOf2<Name, Expr>, val name: AnyOf2<Identifier, Expr>, val args: List<Arg>): ExprCallLike(), Node
data class ExprStaticPropertyFetch(val `class`: AnyOf2<Name, Expr>, val name: AnyOf2<Identifier, Expr>): Expr, Node
data class ExprTernary(val cond: Expr, val `if`: Expr?, val `else`: Expr): Expr, Node
data class ExprThrow(val expr: Expr): Expr, Node
data class ExprUnaryMinus(val expr: Expr): Expr, Node
data class ExprUnaryPlus(val expr: Expr): Expr, Node
data class ExprVariable(val name: AnyOf2<String, Expr>): Expr, Node
data class ExprYield(val key: Expr?, val value: Expr?): Expr, Node
data class ExprYieldFrom(val expr: Expr): Expr, Node
open class Identifier(open val name: String): Node
open class Name(open val parts: List<String>): Node
data class NameFullyQualified(override val parts: List<String>): Name(parts), Node
data class NameRelative(override val parts: List<String>): Name(parts), Node
data class NullableType(val type: AnyOf2<Identifier, Name>): ComplexType(), Node
data class Param(val type: AnyOf3<Identifier, Name, ComplexType>?, val byRef: Boolean, val variadic: Boolean, val `var`: ExprVariable, val default: Expr?): Node
interface Scalar: Expr, Node
data class ScalarDNumber(val value: Double): Scalar, Node
data class ScalarEncapsed(val parts: List<Expr>): Scalar, Node
data class ScalarEncapsedStringPart(val value: String): Scalar, Node
data class ScalarLNumber(val value: Int): Scalar, Node
sealed class ScalarMagicConst(): Scalar, Node
class ScalarMagicConstClass(): ScalarMagicConst(), Node
class ScalarMagicConstDir(): ScalarMagicConst(), Node
class ScalarMagicConstFile(): ScalarMagicConst(), Node
class ScalarMagicConstFunction(): ScalarMagicConst(), Node
class ScalarMagicConstLine(): ScalarMagicConst(), Node
class ScalarMagicConstMethod(): ScalarMagicConst(), Node
class ScalarMagicConstNamespace(): ScalarMagicConst(), Node
class ScalarMagicConstTrait(): ScalarMagicConst(), Node
data class ScalarString(val value: String): Scalar, Node
interface Stmt: Node
data class StmtBreak(val num: Expr?): Stmt, Node
data class StmtCase(val cond: Expr?, val stmts: List<Stmt>): Stmt, Node
data class StmtCatch(val types: List<Name>, val `var`: ExprVariable, val stmts: List<Stmt>): Stmt, Node
data class StmtClass(val flags: Int, val extends: Name?, val implements: List<Name>, override val name: Identifier?, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName), Node
data class StmtClassConst(val flags: Int, val consts: List<Const>): Stmt, Node
sealed class StmtClassLike(open val name: Identifier?, open val stmts: List<Stmt>, open val namespacedName: Name): Stmt, Node
data class StmtClassMethod(val flags: Int, val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>?): Stmt, Node, FunctionLike
data class StmtConst(val consts: List<Const>): Stmt, Node
data class StmtContinue(val num: Expr?): Stmt, Node
data class StmtDeclare(val declares: List<StmtDeclareDeclare>, val stmts: List<Stmt>?): Stmt, Node
data class StmtDeclareDeclare(val key: Identifier, val value: Expr): Stmt, Node
data class StmtDo(val stmts: List<Stmt>, val cond: Expr): Stmt, Node
data class StmtEcho(val exprs: List<Expr>): Stmt, Node
data class StmtElse(val stmts: List<Stmt>): Stmt, Node
data class StmtElseIf(val cond: Expr, val stmts: List<Stmt>): Stmt, Node
data class StmtExpression(val expr: Expr): Stmt, Node
data class StmtFinally(val stmts: List<Stmt>): Stmt, Node
data class StmtFor(val init: List<Expr>, val cond: List<Expr>, val loop: List<Expr>, val stmts: List<Stmt>): Stmt, Node
data class StmtForeach(val expr: Expr, val keyVar: Expr?, val byRef: Boolean, val valueVar: Expr, val stmts: List<Stmt>): Stmt, Node
data class StmtFunction(val byRef: Boolean, val name: Identifier, val params: List<Param>, val returnType: AnyOf3<Identifier, Name, ComplexType>?, val stmts: List<Stmt>, val namespacedName: Name): Stmt, Node, FunctionLike
data class StmtGlobal(val vars: List<Expr>): Stmt, Node
data class StmtGoto(val name: Identifier): Stmt, Node
data class StmtGroupUse(val type: Int, val prefix: Name, val uses: List<StmtUseUse>): Stmt, Node
data class StmtHaltCompiler(val remaining: String): Stmt, Node
data class StmtIf(val cond: Expr, val stmts: List<Stmt>, val elseifs: List<StmtElseIf>, val `else`: StmtElse?): Stmt, Node
data class StmtInlineHTML(val value: String): Stmt, Node
data class StmtInterface(val extends: List<Name>, override val name: Identifier, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName), Node
data class StmtLabel(val name: Identifier): Stmt, Node
data class StmtNamespace(val name: Name?, val stmts: List<Stmt>): Stmt, Node
class StmtNop(): Stmt, Node
data class StmtProperty(val flags: Int, val props: List<StmtPropertyProperty>): Stmt, Node
data class StmtPropertyProperty(val name: Identifier, val default: Expr?): Stmt, Node
data class StmtReturn(val expr: Expr?): Stmt, Node
data class StmtStatic(val vars: List<StmtStaticVar>): Stmt, Node
data class StmtStaticVar(val `var`: ExprVariable, val default: Expr?): Stmt, Node
data class StmtSwitch(val cond: Expr, val cases: List<StmtCase>): Stmt, Node
data class StmtThrow(val expr: Expr): Stmt, Node
data class StmtTrait(override val name: Identifier, override val stmts: List<Stmt>, override val namespacedName: Name): StmtClassLike(name, stmts, namespacedName), Node
data class StmtTraitUse(val traits: List<Name>, val adaptations: List<StmtTraitUseAdaptation>): Stmt, Node
sealed class StmtTraitUseAdaptation(open val trait: Name?, open val method: Identifier): Stmt, Node
data class StmtTraitUseAdaptationAlias(val newModifier: Int?, val newName: Identifier?, override val trait: Name?, override val method: Identifier): StmtTraitUseAdaptation(trait, method), Node
data class StmtTraitUseAdaptationPrecedence(val insteadof: List<Name>, override val trait: Name?, override val method: Identifier): StmtTraitUseAdaptation(trait, method), Node
data class StmtTryCatch(val stmts: List<Stmt>, val catches: List<StmtCatch>, val finally: StmtFinally?): Stmt, Node
data class StmtUnset(val vars: List<Expr>): Stmt, Node
data class StmtUse(val type: Int, val uses: List<StmtUseUse>): Stmt, Node
data class StmtUseUse(val type: Int, val name: Name, val alias: Identifier?): Stmt, Node
data class StmtWhile(val cond: Expr, val stmts: List<Stmt>): Stmt, Node
data class VarLikeIdentifier(override val name: String): Identifier(name), Node