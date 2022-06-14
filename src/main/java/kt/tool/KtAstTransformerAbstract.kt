package kt.tool

import php.ast.Node
import kotlin.reflect.KClass

abstract class KtAstTransformerAbstract {
    protected abstract fun p(node: Node): kt.ast.Node

    protected fun <T> p(node: Node, type: KClass<T>): T {
        return p(node) as T
    }

}