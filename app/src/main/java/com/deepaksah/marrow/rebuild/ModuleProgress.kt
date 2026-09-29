package com.deepaksah.marrow.rebuild

data class ModuleProgress(
    val total: Int,
    val answered: Int,
    val completed: Boolean
) {
    companion object {
        fun from(ids: List<String>, answers: Map<String, McqAnswerState>) =
            ModuleProgress(
                ids.size,
                ids.count { answers[it]?.locked == true },
                ids.isNotEmpty() && ids.all { answers[it]?.locked == true }
            )
    }
}