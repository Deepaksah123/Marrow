package com.deepaksah.marrow.rebuild

class TestNavigator(private val state: MarrowStateStore) {
    fun selectConfiguredTab(tabId: String) {
        state.setSelectedTestGroup(tabId)
    }

    fun openIntro(testId: String) {
        state.selectTest(testId, emptyList())
        state.navigate(MarrowRoute.TEST_INTRO)
    }
    fun start(testId: String, mcqIds: List<String>, endTimeMs: Long?) {
        state.selectTest(testId, mcqIds)
        state.setTestEndTime(endTimeMs)
        state.navigate(MarrowRoute.TEST_PLAY)
    }
    fun openScore() = state.navigate(MarrowRoute.TEST_SCORE)
    fun openReview() = state.navigate(MarrowRoute.TEST_REVIEW)
    fun openAnalytics() = state.navigate(MarrowRoute.TEST_ANALYTICS)
}