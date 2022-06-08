package php.oldast

sealed interface Scalar : Expr

data class ScalarDNumber(val value: Double) : Scalar
data class ScalarString(val value: String) : Scalar
data class ScalarLNumber(val value: Long) : Scalar
data class ScalarEncapsedStringPart(val value: String) : Scalar
data class ScalarEncapsed(val parts: List<Expr>) : Scalar

interface ScalarMagicConst : Scalar {
    val sign: String
}

data class ScalarMagicConstNamespace(override val sign: String = "__NAMESPACE__") : ScalarMagicConst, AstNode
data class ScalarMagicConstClass(override val sign: String = "__CLASS__") : ScalarMagicConst, AstNode
data class ScalarMagicConstDir(override val sign: String = "__DIR__") : ScalarMagicConst, AstNode
data class ScalarMagicConstFile(override val sign: String = "__FILE__") : ScalarMagicConst, AstNode
data class ScalarMagicConstMethod(override val sign: String = "__METHOD__") : ScalarMagicConst, AstNode
data class ScalarMagicConstFunction(override val sign: String = "__FUNCTION__") : ScalarMagicConst, AstNode
data class ScalarMagicConstLine(override val sign: String = "__LINE__") : ScalarMagicConst, AstNode
data class ScalarMagicConstTrait(override val sign: String = "__TRAIT__") : ScalarMagicConst, AstNode