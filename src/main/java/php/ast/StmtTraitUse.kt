package php.ast

data class StmtTraitUse(val traits: List<Name>, val adaptations: List<StmtTraitUseAdaptation>) : Stmt

sealed interface StmtTraitUseAdaptation : Stmt {
    val trait: Name?
    val method: Identifier
}

data class StmtTraitUseAdaptationAlias(
    val newModifier: Int?,
    val newName: Identifier?,
    override val trait: Name?,
    override val method: Identifier
) : StmtTraitUseAdaptation

data class StmtTraitUseAdaptationPrecedence(
    val insteadof: List<Name>,
    override val trait: Name?,
    override val method: Identifier
) : StmtTraitUseAdaptation