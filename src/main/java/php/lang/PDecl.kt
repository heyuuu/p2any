package php.lang

import php.parser.node.Name

sealed interface PDecl
sealed interface PClassLike : PDecl

// function
class PFunc(
    val string: Name
)

// class inner decl
class PClassTraitUse()
class PClassConstant()
class PClassProperty()
class PClassMethod()

// class or interface
sealed interface PClassOrInterface

class PClass(
    val name: String,
    val parentClass: PClass?,
    val interfaces: List<PInterface>,
    val constants: List<PClassConstant>,
    val properties: List<PClassProperty>,
    val methods: List<PClassMethod>,
    val traitUses: List<PClassTraitUse>
) : PClassOrInterface

class PInterface(
    val name: String,
    val interfaces: List<PInterface>,
    val constants: List<PClassConstant>,
    val methods: List<PClassMethod>,
) : PClassOrInterface

// trait

class PTrait(
    val name: String,
    val properties: List<PClassProperty>,
    val methods: List<PClassMethod>,
    val traitUses: List<PClassTraitUse>
) : PClassLike