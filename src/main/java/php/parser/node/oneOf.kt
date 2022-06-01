package php.parser.node

class OneOf2<T1 : Any, T2 : Any>(value1: T1?, value2: T2?) {
    val isType1 = value1 != null
    val isType2 = value2 != null
}

class OneOf3<T1 : Any, T2 : Any, T3 : Any>(value1: T1?, value2: T2?, value3: T3?) {
    val isType1 = value1 != null
    val isType2 = value2 != null
    val isType3 = value3 != null
}