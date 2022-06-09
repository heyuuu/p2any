package php.ast

sealed interface Scalar: Expr
data class ScalarDNumber(val value: Double): Scalar
data class ScalarEncapsed(val parts: List<Expr>): Scalar
data class ScalarEncapsedStringPart(val value: String): Scalar
data class ScalarLNumber(val value: Int): Scalar
data class ScalarString(val value: String): Scalar

sealed class ScalarMagicConst(): Scalar
class ScalarMagicConstClass(): ScalarMagicConst()
class ScalarMagicConstDir(): ScalarMagicConst()
class ScalarMagicConstFile(): ScalarMagicConst()
class ScalarMagicConstFunction(): ScalarMagicConst()
class ScalarMagicConstLine(): ScalarMagicConst()
class ScalarMagicConstMethod(): ScalarMagicConst()
class ScalarMagicConstNamespace(): ScalarMagicConst()
class ScalarMagicConstTrait(): ScalarMagicConst()
