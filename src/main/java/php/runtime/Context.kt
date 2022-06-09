package php.runtime

import php.lang.PClassLike
import php.lang.PFunc

class Context {
    val funcContext = FuncContext()
    val classContext = ClassContext()
}

class FuncContext {
    private val map: MutableMap<String, PFunc> = mutableMapOf()

    operator fun get(key: String): PFunc? {
        // TODO
        return map[key]
    }
}

class ClassContext {
    private val map: MutableMap<String, PClassLike> = mutableMapOf()

    operator fun get(key: String): PClassLike? {
        // TODO
        return map[key]
    }
}