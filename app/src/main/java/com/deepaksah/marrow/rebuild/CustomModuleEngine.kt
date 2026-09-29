package com.deepaksah.marrow.rebuild

object CustomModuleEngine {
    fun next(state: CustomModuleState): CustomModuleState = when(state.step) {
        CustomModuleStep.INTRO -> state.copy(step=CustomModuleStep.MODE)
        CustomModuleStep.MODE -> state.copy(step=CustomModuleStep.SUBJECTS)
        CustomModuleStep.SUBJECTS -> state.copy(step=CustomModuleStep.TOPICS)
        CustomModuleStep.TOPICS -> state.copy(step=CustomModuleStep.TAGS)
        CustomModuleStep.TAGS -> state.copy(step=CustomModuleStep.ADDONS)
        CustomModuleStep.ADDONS -> state.copy(step=CustomModuleStep.GENERATED)
        CustomModuleStep.JOIN -> state.copy(step=CustomModuleStep.PLAY)
        CustomModuleStep.GENERATED -> state.copy(step=CustomModuleStep.PLAY)
        CustomModuleStep.PLAY -> state.copy(step=CustomModuleStep.SCORE)
        CustomModuleStep.SCORE -> state
    }
}