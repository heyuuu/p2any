package kt.ast

sealed interface FuncRef {
    data class FuncRefStatic(val `class`: Name) : FuncRef
    data class FuncRefDynamic(val `class`: Expr) : FuncRef
}

sealed interface ClassRef {
    data class ClassRefStatic(val name: Name) : ClassRef
    data class ClassRefDynamic(val name: Expr) : ClassRef
}

sealed interface PropertyRef {
    data class PropertyRefStatic(val name: Identifier) : PropertyRef
    data class PropertyRefDynamic(val name: Expr) : PropertyRef
}

sealed interface MethodRef {
    data class MethodRefStatic(val name: Identifier) : MethodRef
    data class MethodRefDynamic(val name: Expr) : MethodRef
}


// fetch
sealed interface ExprFetch : Expr
data class ExprArrayDimFetch(val `var`: Expr, val dim: Expr?) : ExprFetch
data class ExprClassConstFetch(val `class`: ClassRef, val name: Identifier) : ExprFetch
data class ExprConstFetch(val name: Name) : ExprFetch
data class ExprPropertyFetch(val `var`: Expr, val name: PropertyRef) : ExprFetch
data class ExprStaticPropertyFetch(val `class`: ClassRef, val name: PropertyRef) : ExprFetch

// call
sealed interface ExprCallLike : Expr {
    val args: List<Arg>
}

data class ExprFuncCall(val name: FuncRef, override val args: List<Arg>) : ExprCallLike
data class ExprMethodCall(val `var`: Expr, val name: MethodRef, override val args: List<Arg>) : ExprCallLike
data class ExprStaticCall(val `class`: ClassRef, val name: MethodRef, override val args: List<Arg>) : ExprCallLike

sealed interface ExprNew : ExprCallLike {
    data class ExprNewStatic(val `class`: Name, override val args: List<Arg>) : ExprNew
    data class ExprNewDynamic(val `class`: Expr, override val args: List<Arg>) : ExprNew
    data class ExprNewAnonymous(val `class`: StmtClass, override val args: List<Arg>) : ExprNew
}