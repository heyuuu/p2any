package php.parser.node


return Arg(value = value, byRef = byRef, unpack = unpack)

return Const(name = name, value = value, namespacedName = namespacedName)

return ExprArray(items = items)

return ExprArrayDimFetch(`var` = `var`, dim = dim)

return ExprArrayItem(
    key = key, // Expr?
    value = value, // Expr
    byRef = byRef, // Boolean
    unpack = unpack, // Boolean
    )

return ExprAssign(`var` = `var`, expr = expr)

return ExprAssignOpBitwiseAnd(`var` = `var`, expr = expr)

return ExprAssignOpBitwiseOr(`var` = `var`, expr = expr)

return ExprAssignOpBitwiseXor(`var` = `var`, expr = expr)

return ExprAssignOpConcat(`var` = `var`, expr = expr)

return ExprAssignOpDiv(`var` = `var`, expr = expr)

return ExprAssignOpMinus(`var` = `var`, expr = expr)

return ExprAssignOpMod(`var` = `var`, expr = expr)

return ExprAssignOpMul(`var` = `var`, expr = expr)

return ExprAssignOpPlus(`var` = `var`, expr = expr)

return ExprAssignOpPow(`var` = `var`, expr = expr)

return ExprAssignOpShiftLeft(`var` = `var`, expr = expr)

return ExprAssignOpShiftRight(`var` = `var`, expr = expr)

return ExprAssignRef(`var` = `var`, expr = expr)

return ExprBinaryOpBitwiseAnd(left = left, right = right)

return ExprBinaryOpBitwiseOr(left = left, right = right)

return ExprBinaryOpBitwiseXor(left = left, right = right)

return ExprBinaryOpBooleanAnd(left = left, right = right)

return ExprBinaryOpBooleanOr(left = left, right = right)

return ExprBinaryOpCoalesce(left = left, right = right)

return ExprBinaryOpConcat(left = left, right = right)

return ExprBinaryOpDiv(left = left, right = right)

return ExprBinaryOpEqual(left = left, right = right)

return ExprBinaryOpGreater(left = left, right = right)

return ExprBinaryOpGreaterOrEqual(left = left, right = right)

return ExprBinaryOpIdentical(left = left, right = right)

return ExprBinaryOpLogicalAnd(left = left, right = right)

return ExprBinaryOpLogicalOr(left = left, right = right)

return ExprBinaryOpLogicalXor(left = left, right = right)

return ExprBinaryOpMinus(left = left, right = right)

return ExprBinaryOpMod(left = left, right = right)

return ExprBinaryOpMul(left = left, right = right)

return ExprBinaryOpNotEqual(left = left, right = right)

return ExprBinaryOpNotIdentical(left = left, right = right)

return ExprBinaryOpPlus(left = left, right = right)

return ExprBinaryOpPow(left = left, right = right)

return ExprBinaryOpShiftLeft(left = left, right = right)

return ExprBinaryOpShiftRight(left = left, right = right)

return ExprBinaryOpSmaller(left = left, right = right)

return ExprBinaryOpSmallerOrEqual(left = left, right = right)

return ExprBinaryOpSpaceship(left = left, right = right)

return ExprBitwiseNot(expr = expr)

return ExprBooleanNot(expr = expr)

return ExprCastArray(expr = expr)

return ExprCastBool(expr = expr)

return ExprCastDouble(expr = expr)

return ExprCastInt(expr = expr)

return ExprCastObject(expr = expr)

return ExprCastString(expr = expr)

return ExprCastUnset(expr = expr)

return ExprClassConstFetch(`class` = `class`, name = name)

return ExprClone(expr = expr)

return ExprClosure(
    static = static, // Boolean
    byRef = byRef, // Boolean
    params = params, // List<Param>
    uses = uses, // List<ExprClosureUse>
    returnType = returnType, // AnyOf3<Identifier, Name, ComplexType>?
    stmts = stmts, // List<Stmt>
    )

return ExprClosureUse(`var` = `var`, byRef = byRef)

return ExprConstFetch(name = name)

return ExprEmpty(expr = expr)

return ExprError()

return ExprErrorSuppress(expr = expr)

return ExprEval(expr = expr)

return ExprExit(expr = expr)

return ExprFuncCall(name = name, args = args)

return ExprInclude(expr = expr, type = type)

return ExprInstanceof(expr = expr, `class` = `class`)

return ExprIsset(vars = vars)

return ExprList(items = items)

return ExprMethodCall(`var` = `var`, name = name, args = args)

return ExprNew(`class` = `class`, args = args)

return ExprPostDec(`var` = `var`)

return ExprPostInc(`var` = `var`)

return ExprPreDec(`var` = `var`)

return ExprPreInc(`var` = `var`)

return ExprPrint(expr = expr)

return ExprPropertyFetch(`var` = `var`, name = name)

return ExprShellExec(parts = parts)

return ExprStaticCall(`class` = `class`, name = name, args = args)

return ExprStaticPropertyFetch(`class` = `class`, name = name)

return ExprTernary(cond = cond, `if` = `if`, `else` = `else`)

return ExprThrow(expr = expr)

return ExprUnaryMinus(expr = expr)

return ExprUnaryPlus(expr = expr)

return ExprVariable(name = name)

return ExprYield(key = key, value = value)

return ExprYieldFrom(expr = expr)

return Identifier(name = name)

return Name(parts = parts)

return NameFullyQualified(parts = parts)

return NameRelative(parts = parts)

return NullableType(type = type)

return Param(
    type = type, // AnyOf3<Identifier, Name, ComplexType>?
    byRef = byRef, // Boolean
    variadic = variadic, // Boolean
    `var` = `var`, // ExprVariable
    default = default, // Expr?
    )

return ScalarDNumber(value = value)

return ScalarEncapsed(parts = parts)

return ScalarEncapsedStringPart(value = value)

return ScalarLNumber(value = value)

return ScalarMagicConstClass()

return ScalarMagicConstDir()

return ScalarMagicConstFile()

return ScalarMagicConstFunction()

return ScalarMagicConstLine()

return ScalarMagicConstMethod()

return ScalarMagicConstNamespace()

return ScalarMagicConstTrait()

return ScalarString(value = value)

return StmtBreak(num = num)

return StmtCase(cond = cond, stmts = stmts)

return StmtCatch(types = types, `var` = `var`, stmts = stmts)

return StmtClass(
    flags = flags, // Int
    extends = extends, // Name?
    implements = implements, // List<Name>
    name = name, // Identifier?
    stmts = stmts, // List<Stmt>
    namespacedName = namespacedName, // Name
    )

return StmtClassConst(flags = flags, consts = consts)

return StmtClassMethod(
    flags = flags, // Int
    byRef = byRef, // Boolean
    name = name, // Identifier
    params = params, // List<Param>
    returnType = returnType, // AnyOf3<Identifier, Name, ComplexType>?
    stmts = stmts, // List<Stmt>?
    )

return StmtConst(consts = consts)

return StmtContinue(num = num)

return StmtDeclare(declares = declares, stmts = stmts)

return StmtDeclareDeclare(key = key, value = value)

return StmtDo(stmts = stmts, cond = cond)

return StmtEcho(exprs = exprs)

return StmtElse(stmts = stmts)

return StmtElseIf(cond = cond, stmts = stmts)

return StmtExpression(expr = expr)

return StmtFinally(stmts = stmts)

return StmtFor(
    init = init, // List<Expr>
    cond = cond, // List<Expr>
    loop = loop, // List<Expr>
    stmts = stmts, // List<Stmt>
    )

return StmtForeach(
    expr = expr, // Expr
    keyVar = keyVar, // Expr?
    byRef = byRef, // Boolean
    valueVar = valueVar, // Expr
    stmts = stmts, // List<Stmt>
    )

return StmtFunction(
    byRef = byRef, // Boolean
    name = name, // Identifier
    params = params, // List<Param>
    returnType = returnType, // AnyOf3<Identifier, Name, ComplexType>?
    stmts = stmts, // List<Stmt>
    namespacedName = namespacedName, // Name
    )

return StmtGlobal(vars = vars)

return StmtGoto(name = name)

return StmtGroupUse(type = type, prefix = prefix, uses = uses)

return StmtHaltCompiler(remaining = remaining)

return StmtIf(
    cond = cond, // Expr
    stmts = stmts, // List<Stmt>
    elseifs = elseifs, // List<StmtElseIf>
    `else` = `else`, // StmtElse?
    )

return StmtInlineHTML(value = value)

return StmtInterface(
    extends = extends, // List<Name>
    name = name, // Identifier
    stmts = stmts, // List<Stmt>
    namespacedName = namespacedName, // Name
    )

return StmtLabel(name = name)

return StmtNamespace(name = name, stmts = stmts)

return StmtNop()

return StmtProperty(flags = flags, props = props)

return StmtPropertyProperty(name = name, default = default)

return StmtReturn(expr = expr)

return StmtStatic(vars = vars)

return StmtStaticVar(`var` = `var`, default = default)

return StmtSwitch(cond = cond, cases = cases)

return StmtThrow(expr = expr)

return StmtTrait(name = name, stmts = stmts, namespacedName = namespacedName)

return StmtTraitUse(traits = traits, adaptations = adaptations)

return StmtTraitUseAdaptationAlias(
    newModifier = newModifier, // Int?
    newName = newName, // Identifier?
    trait = trait, // Name?
    method = method, // Identifier
    )

return StmtTraitUseAdaptationPrecedence(insteadof = insteadof, trait = trait, method = method)

return StmtTryCatch(stmts = stmts, catches = catches, finally = finally)

return StmtUnset(vars = vars)

return StmtUse(type = type, uses = uses)

return StmtUseUse(type = type, name = name, alias = alias)

return StmtWhile(cond = cond, stmts = stmts)

return VarLikeIdentifier(name = name)