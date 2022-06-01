package php

class AnyType2<T1, T2>(val value1: T1?, val value2: T2?) {
    val isType1 = value1 != null
    val isType2 = value2 != null
}

class AnyType3<T1, T2, T3>(val value1: T1?, val value2: T2?, val value3: T3?) {
    val isType1 = value1 != null
    val isType2 = value2 != null
    val isType3 = value3 != null
}