package com.deepaksah.marrow.rebuild

class QBankNavigator(private val state: MarrowStateStore) {
    fun openSubject(subjectId: String) {
        state.selectSubject(subjectId)
        state.navigate(MarrowRoute.QBANK_MODULE)
    }

    fun openModule(moduleId: String, mcqIds: List<String>) {
        state.selectModule(moduleId, mcqIds)
        state.navigate(MarrowRoute.QBANK_PLAY)
    }

    fun openQuestion(index: Int) {
        state.moveQuestion(index)
        state.navigate(MarrowRoute.QBANK_PLAY)
    }

    fun openScore() {
        state.navigate(MarrowRoute.QBANK_SCORE)
    }

    fun openReview() {
        state.navigate(MarrowRoute.QBANK_REVIEW)
    }

    fun openAnalytics() {
        state.navigate(MarrowRoute.QBANK_ANALYTICS)
    }

    fun back(): MarrowRoute {
        val current = state.session.route
        val parent = current.parent ?: MarrowRoute.HOME
        state.navigate(parent)
        return parent
    }
}
