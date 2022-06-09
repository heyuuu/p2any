package php.parser

import php.parser.node.*

class AstTransformer : AstTransformerAbstract() {
    private fun unsupported(node: Node, message: String? = null): Nothing {
        throw Exception("不支持的语法节点类型(${node::class.simpleName}) $message")
    }

    private fun pExpr(node: Expr): php.ast.Expr {
        return p(node, php.ast.Expr::class)
    }

    private fun pExprOrNull(node: Expr?): php.ast.Expr? {
        return node?.let { pExpr(it) }
    }

    private fun pExprs(nodes: List<Expr>): List<php.ast.Expr> {
        return nodes.map { pExpr(it) }
    }

    private fun pStmts(nodes: List<Stmt>): List<php.ast.Stmt> {
        return nodes.map { p(it, php.ast.Stmt::class) }
    }

    override fun p(node: Node): php.ast.Node {
        return when (node) {
            // special
            is Arg -> pArg(node)
            is Const -> pConst(node)
            is Name -> pName(node)
            is Identifier -> pIdentifier(node)
            is NullableType -> pNullableType(node)
            is Param -> pParam(node)

            // expr
            is ExprArray -> pExprArray(node)
            is ExprArrayDimFetch -> pExprArrayDimFetch(node)
            is ExprArrayItem -> pExprArrayItem(node)

            is ExprAssign -> pExprAssign(node)
            is ExprAssignRef -> pExprAssignRef(node)
            is ExprAssignOp -> pExprAssignOp(node)
            is ExprBinaryOp -> pExprBinaryOp(node)
            is ExprCast -> pExprCast(node)

            is ExprBitwiseNot -> pExprBitwiseNot(node)
            is ExprBooleanNot -> pExprBooleanNot(node)

            is ExprClassConstFetch -> pExprClassConstFetch(node)
            is ExprClone -> pExprClone(node)
            is ExprClosure -> pExprClosure(node)
            is ExprClosureUse -> pExprClosureUse(node)
            is ExprConstFetch -> pExprConstFetch(node)
            is ExprEmpty -> pExprEmpty(node)
            is ExprErrorSuppress -> pExprErrorSuppress(node)
            is ExprExit -> pExprExit(node)
            is ExprFuncCall -> pExprFuncCall(node)
            is ExprInclude -> pExprInclude(node)
            is ExprInstanceof -> pExprInstanceof(node)
            is ExprIsset -> pExprIsset(node)
            is ExprList -> pExprList(node)
            is ExprMethodCall -> pExprMethodCall(node)
            is ExprNew -> pExprNew(node)
            is ExprPostDec -> pExprPostDec(node)
            is ExprPostInc -> pExprPostInc(node)
            is ExprPreDec -> pExprPreDec(node)
            is ExprPreInc -> pExprPreInc(node)
            is ExprPrint -> pExprPrint(node)
            is ExprPropertyFetch -> pExprPropertyFetch(node)
            is ExprStaticCall -> pExprStaticCall(node)
            is ExprStaticPropertyFetch -> pExprStaticPropertyFetch(node)
            is ExprTernary -> pExprTernary(node)
            is ExprThrow -> pExprThrow(node)
            is ExprUnaryMinus -> pExprUnaryMinus(node)
            is ExprUnaryPlus -> pExprUnaryPlus(node)
            is ExprVariable -> pExprVariable(node)
            is ExprYield -> pExprYield(node)
            is ExprYieldFrom -> pExprYieldFrom(node)

            // scalar
            is ScalarDNumber -> pScalarDNumber(node)
            is ScalarEncapsed -> pScalarEncapsed(node)
            is ScalarEncapsedStringPart -> pScalarEncapsedStringPart(node)
            is ScalarLNumber -> pScalarLNumber(node)
            is ScalarString -> pScalarString(node)
            is ScalarMagicConst -> pScalarMagicConst(node)

            // stmt
            is StmtHaltCompiler -> php.ast.StmtNop
            is StmtNop -> php.ast.StmtNop

            is StmtBreak -> pStmtBreak(node)
            is StmtClass -> pStmtClass(node)
            is StmtClassConst -> pStmtClassConst(node)
            is StmtClassMethod -> pStmtClassMethod(node)
            is StmtConst -> pStmtConst(node)
            is StmtContinue -> pStmtContinue(node)
            is StmtDeclare -> pStmtDeclare(node)
            is StmtDeclareDeclare -> pStmtDeclareDeclare(node)
            is StmtDo -> pStmtDo(node)
            is StmtEcho -> pStmtEcho(node)
            is StmtExpression -> pStmtExpression(node)
            is StmtFor -> pStmtFor(node)
            is StmtForeach -> pStmtForeach(node)
            is StmtFunction -> pStmtFunction(node)
            is StmtGlobal -> pStmtGlobal(node)
            is StmtGoto -> pStmtGoto(node)
            is StmtGroupUse -> pStmtGroupUse(node)
            is StmtIf -> pStmtIf(node)
            is StmtInlineHTML -> pStmtInlineHTML(node)
            is StmtInterface -> pStmtInterface(node)
            is StmtLabel -> pStmtLabel(node)
            is StmtNamespace -> pStmtNamespace(node)
            is StmtProperty -> pStmtProperty(node)
            is StmtReturn -> pStmtReturn(node)
            is StmtStatic -> pStmtStatic(node)
            is StmtSwitch -> pStmtSwitch(node)
            is StmtThrow -> pStmtThrow(node)
            is StmtTrait -> pStmtTrait(node)
            is StmtTraitUse -> pStmtTraitUse(node)
            is StmtTryCatch -> pStmtTryCatch(node)
            is StmtUnset -> pStmtUnset(node)
            is StmtUse -> pStmtUse(node)
            is StmtWhile -> pStmtWhile(node)

            // 异常类型
            is ExprError -> unsupported(node, "无法转化有语法错误的代码")
            is ExprShellExec -> unsupported(node, "不支持执行shell命令")
            is ExprEval -> unsupported(node, "不支持动态执行php代码")

            else -> throw Exception("不应直接处理的 Node 类型: ${node::class.qualifiedName}")
        }
    }

    private fun pArg(node: Arg): php.ast.Arg {
        val value = node.value
        val byRef = node.byRef
        val unpack = node.unpack

        return php.ast.Arg(
            value = pExpr(value),
            byRef = byRef,
            unpack = unpack,
        )
    }

    private fun pConst(node: Const): php.ast.Const {
        val name = node.name
        val value = node.value
        val namespacedName = node.namespacedName

        return php.ast.Const(
            name = pIdentifier(name),
            value = pExpr(value),
            namespacedName = namespacedName?.let { pName(it) },
        )
    }

    private fun pExprArray(node: ExprArray): php.ast.ExprArray {
        val items = node.items

        return php.ast.ExprArray(
            items = items.map { it?.let { pExprArrayItem(it) } }
        )
    }

    private fun pExprArrayDimFetch(node: ExprArrayDimFetch): php.ast.ExprArrayDimFetch {
        val `var` = node.`var`
        val dim = node.dim

        return php.ast.ExprArrayDimFetch(
            `var` = pExpr(`var`),
            dim = pExprOrNull(dim),
        )
    }

    private fun pExprArrayItem(node: ExprArrayItem): php.ast.ExprArrayItem {
        val key = node.key
        val value = node.value
        val byRef = node.byRef
        val unpack = node.unpack

        return php.ast.ExprArrayItem(
            key = pExprOrNull(key),
            value = pExpr(value),
            byRef = byRef,
            unpack = unpack,
        )
    }

    private fun pExprAssign(node: ExprAssign): php.ast.ExprAssign {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssign(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOp(node: ExprAssignOp): php.ast.ExprAssignOp {
        val `var` = pExpr(node.`var`)
        val expr = pExpr(node.expr)

        return when (node) {
            is ExprAssignOpBitwiseAnd -> php.ast.ExprAssignOpBitwiseAnd(`var`, expr)
            is ExprAssignOpBitwiseOr -> php.ast.ExprAssignOpBitwiseOr(`var`, expr)
            is ExprAssignOpBitwiseXor -> php.ast.ExprAssignOpBitwiseXor(`var`, expr)
            is ExprAssignOpConcat -> php.ast.ExprAssignOpConcat(`var`, expr)
            is ExprAssignOpDiv -> php.ast.ExprAssignOpDiv(`var`, expr)
            is ExprAssignOpMinus -> php.ast.ExprAssignOpMinus(`var`, expr)
            is ExprAssignOpMod -> php.ast.ExprAssignOpMod(`var`, expr)
            is ExprAssignOpMul -> php.ast.ExprAssignOpMul(`var`, expr)
            is ExprAssignOpPlus -> php.ast.ExprAssignOpPlus(`var`, expr)
            is ExprAssignOpPow -> php.ast.ExprAssignOpPow(`var`, expr)
            is ExprAssignOpShiftLeft -> php.ast.ExprAssignOpShiftLeft(`var`, expr)
            is ExprAssignOpShiftRight -> php.ast.ExprAssignOpShiftRight(`var`, expr)
        }
    }

    private fun pExprAssignOpBitwiseAnd(node: ExprAssignOpBitwiseAnd): php.ast.ExprAssignOpBitwiseAnd {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpBitwiseAnd(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpBitwiseOr(node: ExprAssignOpBitwiseOr): php.ast.ExprAssignOpBitwiseOr {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpBitwiseOr(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpBitwiseXor(node: ExprAssignOpBitwiseXor): php.ast.ExprAssignOpBitwiseXor {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpBitwiseXor(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpConcat(node: ExprAssignOpConcat): php.ast.ExprAssignOpConcat {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpConcat(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpDiv(node: ExprAssignOpDiv): php.ast.ExprAssignOpDiv {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpDiv(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpMinus(node: ExprAssignOpMinus): php.ast.ExprAssignOpMinus {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpMinus(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpMod(node: ExprAssignOpMod): php.ast.ExprAssignOpMod {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpMod(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpMul(node: ExprAssignOpMul): php.ast.ExprAssignOpMul {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpMul(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpPlus(node: ExprAssignOpPlus): php.ast.ExprAssignOpPlus {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpPlus(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpPow(node: ExprAssignOpPow): php.ast.ExprAssignOpPow {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpPow(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpShiftLeft(node: ExprAssignOpShiftLeft): php.ast.ExprAssignOpShiftLeft {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpShiftLeft(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignOpShiftRight(node: ExprAssignOpShiftRight): php.ast.ExprAssignOpShiftRight {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignOpShiftRight(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprAssignRef(node: ExprAssignRef): php.ast.ExprAssignRef {
        val `var` = node.`var`
        val expr = node.expr

        return php.ast.ExprAssignRef(
            `var` = pExpr(`var`),
            expr = pExpr(expr),
        )
    }

    private fun pExprBinaryOp(node: ExprBinaryOp): php.ast.ExprBinaryOp {
        val left = pExpr(node.left)
        val right = pExpr(node.right)

        return when (node) {
            is ExprBinaryOpBitwiseAnd -> php.ast.ExprBinaryOpBitwiseAnd(left, right)
            is ExprBinaryOpBitwiseOr -> php.ast.ExprBinaryOpBitwiseOr(left, right)
            is ExprBinaryOpBitwiseXor -> php.ast.ExprBinaryOpBitwiseXor(left, right)
            is ExprBinaryOpBooleanAnd -> php.ast.ExprBinaryOpBooleanAnd(left, right)
            is ExprBinaryOpBooleanOr -> php.ast.ExprBinaryOpBooleanOr(left, right)
            is ExprBinaryOpCoalesce -> php.ast.ExprBinaryOpCoalesce(left, right)
            is ExprBinaryOpConcat -> php.ast.ExprBinaryOpConcat(left, right)
            is ExprBinaryOpDiv -> php.ast.ExprBinaryOpDiv(left, right)
            is ExprBinaryOpEqual -> php.ast.ExprBinaryOpEqual(left, right)
            is ExprBinaryOpGreater -> php.ast.ExprBinaryOpGreater(left, right)
            is ExprBinaryOpGreaterOrEqual -> php.ast.ExprBinaryOpGreaterOrEqual(left, right)
            is ExprBinaryOpIdentical -> php.ast.ExprBinaryOpIdentical(left, right)
            is ExprBinaryOpLogicalAnd -> php.ast.ExprBinaryOpLogicalAnd(left, right)
            is ExprBinaryOpLogicalOr -> php.ast.ExprBinaryOpLogicalOr(left, right)
            is ExprBinaryOpLogicalXor -> php.ast.ExprBinaryOpLogicalXor(left, right)
            is ExprBinaryOpMinus -> php.ast.ExprBinaryOpMinus(left, right)
            is ExprBinaryOpMod -> php.ast.ExprBinaryOpMod(left, right)
            is ExprBinaryOpMul -> php.ast.ExprBinaryOpMul(left, right)
            is ExprBinaryOpNotEqual -> php.ast.ExprBinaryOpNotEqual(left, right)
            is ExprBinaryOpNotIdentical -> php.ast.ExprBinaryOpNotIdentical(left, right)
            is ExprBinaryOpPlus -> php.ast.ExprBinaryOpPlus(left, right)
            is ExprBinaryOpPow -> php.ast.ExprBinaryOpPow(left, right)
            is ExprBinaryOpShiftLeft -> php.ast.ExprBinaryOpShiftLeft(left, right)
            is ExprBinaryOpShiftRight -> php.ast.ExprBinaryOpShiftRight(left, right)
            is ExprBinaryOpSmaller -> php.ast.ExprBinaryOpSmaller(left, right)
            is ExprBinaryOpSmallerOrEqual -> php.ast.ExprBinaryOpSmallerOrEqual(left, right)
            is ExprBinaryOpSpaceship -> php.ast.ExprBinaryOpSpaceship(left, right)
        }
    }

    private fun pExprBitwiseNot(node: ExprBitwiseNot): php.ast.ExprBitwiseNot {
        val expr = node.expr

        return php.ast.ExprBitwiseNot(
            expr = pExpr(expr),
        )
    }

    private fun pExprBooleanNot(node: ExprBooleanNot): php.ast.ExprBooleanNot {
        val expr = node.expr

        return php.ast.ExprBooleanNot(
            expr = pExpr(expr),
        )
    }

    private fun pExprCast(node: ExprCast): php.ast.ExprCast {
        val expr = pExpr(node.expr)

        return when (node) {
            is ExprCastArray -> php.ast.ExprCastArray(expr)
            is ExprCastBool -> php.ast.ExprCastBool(expr)
            is ExprCastDouble -> php.ast.ExprCastDouble(expr)
            is ExprCastInt -> php.ast.ExprCastInt(expr)
            is ExprCastObject -> php.ast.ExprCastObject(expr)
            is ExprCastString -> php.ast.ExprCastString(expr)
            is ExprCastUnset -> php.ast.ExprCastUnset(expr)
        }
    }

    private fun pExprClassConstFetch(node: ExprClassConstFetch): php.ast.ExprClassConstFetch {
        val `class` = node.`class`
        val name = node.name

        return php.ast.ExprClassConstFetch(
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.Expr::class),
            name = pIdentifier(name),
        )
    }

    private fun pExprClone(node: ExprClone): php.ast.ExprClone {
        val expr = node.expr

        return php.ast.ExprClone(
            expr = pExpr(expr),
        )
    }

    private fun pExprClosure(node: ExprClosure): php.ast.ExprClosure {
        val static = node.static
        val byRef = node.byRef
        val params = node.params
        val uses = node.uses
        val returnType = node.returnType
        val stmts = node.stmts

        return php.ast.ExprClosure(
            static = static,
            byRef = byRef,
            params = params.map { pParam(it) },
            uses = uses.map { pExprClosureUse(it) },
            returnType = pAnyOf3OrNull(returnType, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            stmts = pStmts(stmts),
        )
    }

    private fun pExprClosureUse(node: ExprClosureUse): php.ast.ExprClosureUse {
        val `var` = node.`var`
        val byRef = node.byRef

        return php.ast.ExprClosureUse(
            `var` = pExprVariable(`var`),
            byRef = byRef,
        )
    }

    private fun pExprConstFetch(node: ExprConstFetch): php.ast.ExprConstFetch {
        val name = node.name

        return php.ast.ExprConstFetch(
            name = pName(name),
        )
    }

    private fun pExprEmpty(node: ExprEmpty): php.ast.ExprEmpty {
        val expr = node.expr

        return php.ast.ExprEmpty(
            expr = pExpr(expr),
        )
    }

    private fun pExprErrorSuppress(node: ExprErrorSuppress): php.ast.ExprErrorSuppress {
        val expr = node.expr

        return php.ast.ExprErrorSuppress(
            expr = pExpr(expr),
        )
    }

    private fun pExprExit(node: ExprExit): php.ast.ExprExit {
        val expr = node.expr

        return php.ast.ExprExit(
            expr = pExprOrNull(expr),
        )
    }

    private fun pExprFuncCall(node: ExprFuncCall): php.ast.ExprFuncCall {
        val name = node.name
        val args = node.args

        return php.ast.ExprFuncCall(
            name = pAnyOf2(name, php.ast.Name::class, php.ast.Expr::class),
            args = args.map { pArg(it) },
        )
    }

    private fun pExprInclude(node: ExprInclude): php.ast.ExprInclude {
        val expr = node.expr
        val type = node.type

        return php.ast.ExprInclude(
            expr = pExpr(expr),
            type = type,
        )
    }

    private fun pExprInstanceof(node: ExprInstanceof): php.ast.ExprInstanceof {
        val expr = node.expr
        val `class` = node.`class`

        return php.ast.ExprInstanceof(
            expr = pExpr(expr),
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.ExprVariable::class),
        )
    }

    private fun pExprIsset(node: ExprIsset): php.ast.ExprIsset {
        val vars = node.vars

        return php.ast.ExprIsset(
            vars = pExprs(vars),
        )
    }

    private fun pExprList(node: ExprList): php.ast.ExprList {
        val items = node.items

        return php.ast.ExprList(
            items = items.map { it?.let { pExprArrayItem(it) } },
        )
    }

    private fun pExprMethodCall(node: ExprMethodCall): php.ast.ExprMethodCall {
        val `var` = node.`var`
        val name = node.name
        val args = node.args

        return php.ast.ExprMethodCall(
            `var` = pExpr(`var`),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
            args = args.map { pArg(it) },
        )
    }

    private fun pExprNew(node: ExprNew): php.ast.ExprNew {
        val `class` = node.`class`
        val args = node.args

        return php.ast.ExprNew(
            `class` = pAnyOf3(`class`, php.ast.Name::class, php.ast.Expr::class, php.ast.StmtClass::class),
            args = args.map { pArg(it) },
        )
    }

    private fun pExprPostDec(node: ExprPostDec): php.ast.ExprPostDec {
        val `var` = node.`var`

        return php.ast.ExprPostDec(
            `var` = pExpr(`var`),
        )
    }

    private fun pExprPostInc(node: ExprPostInc): php.ast.ExprPostInc {
        val `var` = node.`var`

        return php.ast.ExprPostInc(
            `var` = pExpr(`var`),
        )
    }

    private fun pExprPreDec(node: ExprPreDec): php.ast.ExprPreDec {
        val `var` = node.`var`

        return php.ast.ExprPreDec(
            `var` = pExpr(`var`),
        )
    }

    private fun pExprPreInc(node: ExprPreInc): php.ast.ExprPreInc {
        val `var` = node.`var`

        return php.ast.ExprPreInc(
            `var` = pExpr(`var`),
        )
    }

    private fun pExprPrint(node: ExprPrint): php.ast.ExprPrint {
        val expr = node.expr

        return php.ast.ExprPrint(
            expr = pExpr(expr),
        )
    }

    private fun pExprPropertyFetch(node: ExprPropertyFetch): php.ast.ExprPropertyFetch {
        val `var` = node.`var`
        val name = node.name

        return php.ast.ExprPropertyFetch(
            `var` = pExpr(`var`),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
        )
    }

    private fun pExprStaticCall(node: ExprStaticCall): php.ast.ExprStaticCall {
        val `class` = node.`class`
        val name = node.name
        val args = node.args

        return php.ast.ExprStaticCall(
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.Expr::class),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
            args = args.map { pArg(it) },
        )
    }

    private fun pExprStaticPropertyFetch(node: ExprStaticPropertyFetch): php.ast.ExprStaticPropertyFetch {
        val `class` = node.`class`
        val name = node.name

        return php.ast.ExprStaticPropertyFetch(
            `class` = pAnyOf2(`class`, php.ast.Name::class, php.ast.Expr::class),
            name = pAnyOf2(name, php.ast.Identifier::class, php.ast.Expr::class),
        )
    }

    private fun pExprTernary(node: ExprTernary): php.ast.ExprTernary {
        val cond = node.cond
        val `if` = node.`if`
        val `else` = node.`else`

        return php.ast.ExprTernary(
            cond = pExpr(cond),
            `if` = pExprOrNull(`if`),
            `else` = pExpr(`else`),
        )
    }

    private fun pExprThrow(node: ExprThrow): php.ast.ExprThrow {
        val expr = node.expr

        return php.ast.ExprThrow(
            expr = pExpr(expr),
        )
    }

    private fun pExprUnaryMinus(node: ExprUnaryMinus): php.ast.ExprUnaryMinus {
        val expr = node.expr

        return php.ast.ExprUnaryMinus(
            expr = pExpr(expr),
        )
    }

    private fun pExprUnaryPlus(node: ExprUnaryPlus): php.ast.ExprUnaryPlus {
        val expr = node.expr

        return php.ast.ExprUnaryPlus(
            expr = pExpr(expr),
        )
    }

    private fun pExprVariable(node: ExprVariable): php.ast.ExprVariable {
        val name = node.name

        return php.ast.ExprVariable(
            name = pAnyOf2(name, String::class, php.ast.Expr::class),
        )
    }

    private fun pExprYield(node: ExprYield): php.ast.ExprYield {
        val key = node.key
        val value = node.value

        return php.ast.ExprYield(
            key = pExprOrNull(key),
            value = pExprOrNull(value),
        )
    }

    private fun pExprYieldFrom(node: ExprYieldFrom): php.ast.ExprYieldFrom {
        val expr = node.expr

        return php.ast.ExprYieldFrom(
            expr = pExpr(expr),
        )
    }

    private fun pIdentifier(node: Identifier): php.ast.Identifier {
        return php.ast.Identifier(node.name, node is VarLikeIdentifier)
    }

    private fun pName(node: Name): php.ast.Name {
        if (node is NameRelative) {
            throw Exception("预期外的 Name 类型(${node::class.qualifiedName})，请确认 node 数据是否执行 php NameResolve。")
        }

        return php.ast.Name(node.parts, node is NameFullyQualified)
    }

    private fun pNullableType(node: NullableType): php.ast.NullableType {
        val type = node.type

        return php.ast.NullableType(
            type = pAnyOf2(type, php.ast.Identifier::class, php.ast.Name::class),
        )
    }

    private fun pParam(node: Param): php.ast.Param {
        val type = node.type
        val byRef = node.byRef
        val variadic = node.variadic
        val `var` = node.`var`
        val default = node.default

        return php.ast.Param(
            type = pAnyOf3OrNull(type, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            byRef = byRef,
            variadic = variadic,
            `var` = pExprVariable(`var`),
            default = pExprOrNull(default),
        )
    }

    private fun pScalarDNumber(node: ScalarDNumber): php.ast.ScalarDNumber {
        val value = node.value

        return php.ast.ScalarDNumber(
            value = value,
        )
    }

    private fun pScalarEncapsed(node: ScalarEncapsed): php.ast.ScalarEncapsed {
        val parts = node.parts

        return php.ast.ScalarEncapsed(
            parts = pExprs(parts),
        )
    }

    private fun pScalarEncapsedStringPart(node: ScalarEncapsedStringPart): php.ast.ScalarEncapsedStringPart {
        val value = node.value

        return php.ast.ScalarEncapsedStringPart(
            value = value,
        )
    }

    private fun pScalarLNumber(node: ScalarLNumber): php.ast.ScalarLNumber {
        val value = node.value

        return php.ast.ScalarLNumber(
            value = value,
        )
    }

    private fun pScalarMagicConst(node: ScalarMagicConst): php.ast.ScalarMagicConst {
        return when (node) {
            is ScalarMagicConstClass -> php.ast.ScalarMagicConstClass()
            is ScalarMagicConstDir -> php.ast.ScalarMagicConstDir()
            is ScalarMagicConstFile -> php.ast.ScalarMagicConstFile()
            is ScalarMagicConstFunction -> php.ast.ScalarMagicConstFunction()
            is ScalarMagicConstLine -> php.ast.ScalarMagicConstLine()
            is ScalarMagicConstMethod -> php.ast.ScalarMagicConstMethod()
            is ScalarMagicConstNamespace -> php.ast.ScalarMagicConstNamespace()
            is ScalarMagicConstTrait -> php.ast.ScalarMagicConstTrait()
        }
    }

    private fun pScalarString(node: ScalarString): php.ast.ScalarString {
        val value = node.value

        return php.ast.ScalarString(
            value = value,
        )
    }

    private fun pStmtBreak(node: StmtBreak): php.ast.StmtBreak {
        val num = node.num

        return php.ast.StmtBreak(
            num = pExprOrNull(num),
        )
    }

    private fun pStmtClass(node: StmtClass): php.ast.StmtClass {
        val flags = node.flags
        val extends = node.extends
        val implements = node.implements
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtClass(
            flags = flags,
            extends = extends?.let { pName(it) },
            implements = implements.map { pName(it) },
            name = name?.let { pIdentifier(it) },
            stmts = pStmts(stmts),
            namespacedName = pName(namespacedName),
        )
    }

    private fun pStmtClassConst(node: StmtClassConst): php.ast.StmtClassConst {
        val flags = node.flags
        val consts = node.consts

        return php.ast.StmtClassConst(
            flags = flags,
            consts = consts.map { pConst(it) },
        )
    }

    private fun pStmtClassMethod(node: StmtClassMethod): php.ast.StmtClassMethod {
        val flags = node.flags
        val byRef = node.byRef
        val name = node.name
        val params = node.params
        val returnType = node.returnType
        val stmts = node.stmts

        return php.ast.StmtClassMethod(
            flags = flags,
            byRef = byRef,
            name = pIdentifier(name),
            params = params.map { pParam(it) },
            returnType = pAnyOf3OrNull(returnType, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            stmts = stmts?.let { pStmts(it) }
        )
    }

    private fun pStmtConst(node: StmtConst): php.ast.StmtConst {
        val consts = node.consts

        return php.ast.StmtConst(
            consts = consts.map { pConst(it) },
        )
    }

    private fun pStmtContinue(node: StmtContinue): php.ast.StmtContinue {
        val num = node.num

        return php.ast.StmtContinue(
            num = pExprOrNull(num),
        )
    }

    private fun pStmtDeclare(node: StmtDeclare): php.ast.StmtDeclare {
        val declares = node.declares
        val stmts = node.stmts

        return php.ast.StmtDeclare(
            declares = declares.map { pStmtDeclareDeclare(it) },
            stmts = stmts?.let { pStmts(it) }
        )
    }

    private fun pStmtDeclareDeclare(node: StmtDeclareDeclare): php.ast.StmtDeclareDeclare {
        val key = node.key
        val value = node.value

        return php.ast.StmtDeclareDeclare(
            key = pIdentifier(key),
            value = pExpr(value),
        )
    }

    private fun pStmtDo(node: StmtDo): php.ast.StmtDo {
        val stmts = node.stmts
        val cond = node.cond

        return php.ast.StmtDo(
            stmts = pStmts(stmts),
            cond = pExpr(cond),
        )
    }

    private fun pStmtEcho(node: StmtEcho): php.ast.StmtEcho {
        val exprs = node.exprs

        return php.ast.StmtEcho(
            exprs = pExprs(exprs),
        )
    }

    private fun pStmtExpression(node: StmtExpression): php.ast.StmtExpression {
        val expr = node.expr

        return php.ast.StmtExpression(
            expr = pExpr(expr),
        )
    }


    private fun pStmtFor(node: StmtFor): php.ast.StmtFor {
        val init = node.init
        val cond = node.cond
        val loop = node.loop
        val stmts = node.stmts

        return php.ast.StmtFor(
            init = pExprs(init),
            cond = pExprs(cond),
            loop = pExprs(loop),
            stmts = pStmts(stmts),
        )
    }

    private fun pStmtForeach(node: StmtForeach): php.ast.StmtForeach {
        val expr = node.expr
        val keyVar = node.keyVar
        val byRef = node.byRef
        val valueVar = node.valueVar
        val stmts = node.stmts

        return php.ast.StmtForeach(
            expr = pExpr(expr),
            keyVar = pExprOrNull(keyVar),
            byRef = byRef,
            valueVar = pExpr(valueVar),
            stmts = pStmts(stmts),
        )
    }

    private fun pStmtFunction(node: StmtFunction): php.ast.StmtFunction {
        val byRef = node.byRef
        val name = node.name
        val params = node.params
        val returnType = node.returnType
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtFunction(
            byRef = byRef,
            name = pIdentifier(name),
            params = params.map { pParam(it) },
            returnType = pAnyOf3OrNull(returnType, php.ast.Identifier::class, php.ast.Name::class, php.ast.ComplexType::class),
            stmts = pStmts(stmts),
            namespacedName = pName(namespacedName),
        )
    }

    private fun pStmtGlobal(node: StmtGlobal): php.ast.StmtGlobal {
        val vars = node.vars

        return php.ast.StmtGlobal(
            vars = pExprs(vars),
        )
    }

    private fun pStmtGoto(node: StmtGoto): php.ast.StmtGoto {
        val name = node.name

        return php.ast.StmtGoto(
            name = pIdentifier(name),
        )
    }

    private fun pStmtGroupUse(node: StmtGroupUse): php.ast.StmtGroupUse {
        val type = node.type
        val prefix = node.prefix
        val uses = node.uses

        return php.ast.StmtGroupUse(
            type = type,
            prefix = pName(prefix),
            uses = uses.map { pStmtUseUse(it) },
        )
    }

    private fun pStmtIf(node: StmtIf): php.ast.StmtIf {
        val cond = node.cond
        val stmts = node.stmts
        val elseifs = node.elseifs
        val `else` = node.`else`

        return php.ast.StmtIf(
            branches = listOf(
                Pair(pExpr(cond), pStmts(stmts)),
                *elseifs.map {
                    Pair(pExpr(it.cond), pStmts(it.stmts))
                }.toTypedArray()
            ),
            defaultBranch = `else`?.let {
                pStmts(it.stmts)
            }
        )
    }

    private fun pStmtInlineHTML(node: StmtInlineHTML): php.ast.StmtInlineHTML {
        val value = node.value

        return php.ast.StmtInlineHTML(
            value = value,
        )
    }

    private fun pStmtInterface(node: StmtInterface): php.ast.StmtInterface {
        val name = node.name
        val extends = node.extends
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtInterface(
            name = pIdentifier(name),
            extends = extends.map { pName(it) },
            stmts = pStmts(stmts),
            namespacedName = pName(namespacedName),
        )
    }

    private fun pStmtLabel(node: StmtLabel): php.ast.StmtLabel {
        val name = node.name

        return php.ast.StmtLabel(
            name = pIdentifier(name),
        )
    }

    private fun pStmtNamespace(node: StmtNamespace): php.ast.StmtNamespace {
        val name = node.name
        val stmts = node.stmts

        return php.ast.StmtNamespace(
            name = name?.let { pName(it) },
            stmts = pStmts(stmts),
        )
    }

    private fun pStmtProperty(node: StmtProperty): php.ast.StmtProperty {
        val flags = node.flags
        val props = node.props

        return php.ast.StmtProperty(
            flags = flags,
            props = props.map { pStmtPropertyProperty(it) },
        )
    }

    private fun pStmtPropertyProperty(node: StmtPropertyProperty): php.ast.StmtPropertyProperty {
        val name = node.name
        val default = node.default

        return php.ast.StmtPropertyProperty(
            name = pIdentifier(name),
            default = pExprOrNull(default),
        )
    }

    private fun pStmtReturn(node: StmtReturn): php.ast.StmtReturn {
        val expr = node.expr

        return php.ast.StmtReturn(
            expr = pExprOrNull(expr),
        )
    }

    private fun pStmtStatic(node: StmtStatic): php.ast.StmtStatic {
        val vars = node.vars

        return php.ast.StmtStatic(
            vars = vars.map { pStmtStaticVar(it) },
        )
    }

    private fun pStmtStaticVar(node: StmtStaticVar): php.ast.StmtStaticVar {
        val `var` = node.`var`
        val default = node.default

        return php.ast.StmtStaticVar(
            `var` = pExprVariable(`var`),
            default = pExprOrNull(default),
        )
    }

    private fun pStmtSwitch(node: StmtSwitch): php.ast.StmtSwitch {
        val cond = node.cond
        val cases = node.cases

        return php.ast.StmtSwitch(
            cond = pExpr(cond),
            cases = cases.map { (cond, stmts) ->
                Pair(pExprOrNull(cond), pStmts(stmts))
            },
        )
    }

    private fun pStmtThrow(node: StmtThrow): php.ast.StmtThrow {
        val expr = node.expr

        return php.ast.StmtThrow(
            expr = pExpr(expr),
        )
    }

    private fun pStmtTrait(node: StmtTrait): php.ast.StmtTrait {
        val name = node.name
        val stmts = node.stmts
        val namespacedName = node.namespacedName

        return php.ast.StmtTrait(
            name = pIdentifier(name),
            stmts = pStmts(stmts),
            namespacedName = pName(namespacedName),
        )
    }

    private fun pStmtTraitUse(node: StmtTraitUse): php.ast.StmtTraitUse {
        val traits = node.traits
        val adaptations = node.adaptations

        return php.ast.StmtTraitUse(
            traits = traits.map { pName(it) },
            adaptations = adaptations.map { pStmtTraitUseAdaptationAlias(it) }
        )
    }

    private fun pStmtTraitUseAdaptationAlias(node: StmtTraitUseAdaptation): php.ast.StmtTraitUseAdaptation {
        return when (node) {
            is StmtTraitUseAdaptationAlias -> pStmtTraitUseAdaptationAlias(node)
            is StmtTraitUseAdaptationPrecedence -> pStmtTraitUseAdaptationPrecedence(node)
        }
    }

    private fun pStmtTraitUseAdaptationAlias(node: StmtTraitUseAdaptationAlias): php.ast.StmtTraitUseAdaptationAlias {
        val newModifier = node.newModifier
        val newName = node.newName
        val trait = node.trait
        val method = node.method

        return php.ast.StmtTraitUseAdaptationAlias(
            newModifier = newModifier,
            newName = newName?.let { pIdentifier(it) },
            trait = trait?.let { pName(it) },
            method = pIdentifier(method),
        )
    }

    private fun pStmtTraitUseAdaptationPrecedence(node: StmtTraitUseAdaptationPrecedence): php.ast.StmtTraitUseAdaptationPrecedence {
        val insteadof = node.insteadof
        val trait = node.trait
        val method = node.method

        return php.ast.StmtTraitUseAdaptationPrecedence(
            insteadof = insteadof.map { pName(it) },
            trait = trait?.let { pName(it) },
            method = pIdentifier(method),
        )
    }

    private fun pStmtTryCatch(node: StmtTryCatch): php.ast.StmtTryCatch {
        val stmts = node.stmts
        val catches = node.catches
        val finally = node.finally

        return php.ast.StmtTryCatch(
            stmts = pStmts(stmts),
            catches = catches.map { (types, `var`, stmts) ->
                php.ast.StmtTryCatch.CatchBranch(
                    types = types.map { pName(it) },
                    `var` = pExprVariable(`var`),
                    stmts = pStmts(stmts),
                )
            },
            finally = finally?.let { pStmts(it.stmts) },
        )
    }

    private fun pStmtUnset(node: StmtUnset): php.ast.StmtUnset {
        val vars = node.vars

        return php.ast.StmtUnset(
            vars = pExprs(vars),
        )
    }

    private fun pStmtUse(node: StmtUse): php.ast.StmtUse {
        val type = node.type
        val uses = node.uses

        return php.ast.StmtUse(
            type = type,
            uses = uses.map { pStmtUseUse(it) },
        )
    }

    private fun pStmtUseUse(node: StmtUseUse): php.ast.StmtUseUse {
        val type = node.type
        val name = node.name
        val alias = node.alias

        return php.ast.StmtUseUse(
            type = type,
            name = pName(name),
            alias = alias?.let { pIdentifier(it) },
        )
    }

    private fun pStmtWhile(node: StmtWhile): php.ast.StmtWhile {
        val cond = node.cond
        val stmts = node.stmts

        return php.ast.StmtWhile(
            cond = pExpr(cond),
            stmts = pStmts(stmts),
        )
    }
}