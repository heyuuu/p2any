package php.lang

sealed interface PType

object PTypeNull : PType
object PTypeBool : PType
object PTypeInt : PType
object PTypeFloat : PType
object PTypeString : PType