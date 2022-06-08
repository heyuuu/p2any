package php.parser

import php.parser.node.AnyOf
import php.parser.node.Node
import php.parser.node.Stmt
import kotlin.reflect.KClass
import kotlin.reflect.cast

abstract class AstTransformerAbstract {
    fun transform(node: Stmt) = p(node, php.ast.Stmt::class)
    fun transform(nodes: List<Stmt>) = nodes.map { transform(it) }

    protected abstract fun p(node: Node): php.ast.Node

    private fun pAny(value: Any): Any {
        return if (value is Node) p(value) else value
    }

    protected fun <T : Any> p(node: Node, type: KClass<T>): T {
        return type.cast(p(node))
    }

    protected fun <T : Any> pOrNull(node: Node?, type: KClass<T>): T? {
        return node?.let { p(node, type) }
    }

    protected fun <T : Any> pList(items: List<Any>, type: KClass<T>): List<T> {
        return items.map { type.cast(pAny(it)) }
    }

    protected fun <T : Any> pListOrNull(items: List<Any>?, type: KClass<T>): List<T>? {
        return items?.let { pList(it, type) }
    }

    protected fun <T : Any> pListOfNullable(items: List<Node?>, type: KClass<T>): List<T?> {
        return items.map { item -> item?.let { type.cast(pAny(it)) } }
    }

    protected fun <T1 : Any, T2 : Any> pAnyOf2(
        node: AnyOf, type1: KClass<T1>, type2: KClass<T2>
    ): php.ast.AnyOf2<T1, T2> {
        return php.ast.AnyOf2(pAny(node.value), type1, type2)
    }

    protected fun <T1 : Any, T2 : Any, T3 : Any> pAnyOf3(
        node: AnyOf, type1: KClass<T1>, type2: KClass<T2>, type3: KClass<T3>
    ): php.ast.AnyOf3<T1, T2, T3> {
        return php.ast.AnyOf3(pAny(node.value), type1, type2, type3)
    }

    protected fun <T1 : Any, T2 : Any, T3 : Any> pAnyOf3OrNull(
        node: AnyOf?, type1: KClass<T1>, type2: KClass<T2>, type3: KClass<T3>
    ): php.ast.AnyOf3<T1, T2, T3>? {
        return node?.let { pAnyOf3(it, type1, type2, type3) }
    }
}