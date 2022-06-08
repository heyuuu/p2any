package php.parser.node


const val MODIFIER_PUBLIC = 1;
const val MODIFIER_PROTECTED = 2;
const val MODIFIER_PRIVATE = 4;
const val MODIFIER_STATIC = 8;
const val MODIFIER_ABSTRACT = 16;
const val MODIFIER_FINAL = 32;

enum class Modifier(val flag: Int) {
    PUBLIC(1),
    PROTECTED(2),
    PRIVATE(4),
    STATIC(8),
    ABSTRACT(16),
    FINAL(32);

    fun match(modifiers: Int): Boolean {
        return flag.and(modifiers) != 0
    }
}

enum class IncludeType(val type: Int, val code: String) {
    INCLUDE(1, "include"),
    INCLUDE_ONCE(2, "include_once"),
    REQUIRE(3, "require"),
    REQUIRE_ONCE(4, "require_once");

    companion object {
        fun get(type: Int): IncludeType? {
            return values().firstOrNull { it.type == type }
        }
    }
}

enum class UseType(val type: Int) {
    /** Class or namespace import */
    NORMAL(1),

    /** Function import */
    FUNCTION(2),

    /** Constant import */
    CONSTANT(3);
}