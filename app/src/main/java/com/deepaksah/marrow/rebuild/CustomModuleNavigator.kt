package com.deepaksah.marrow.rebuild

class CustomModuleNavigator(private val state: MarrowStateStore) {
    fun intro() = state.navigate(MarrowRoute.CUSTOM_INTRO)
    // Recovered source proves separate creation/mode/subject/topic/tag/add-on stages.
    fun recoveredCreationStages(): List<MarrowRoute> = listOf(
        MarrowRoute.CUSTOM_MODE,
        MarrowRoute.CUSTOM_SUBJECTS,
        MarrowRoute.CUSTOM_TOPICS,
        MarrowRoute.CUSTOM_TAGS,
        MarrowRoute.CUSTOM_ADDONS
    )

    fun creation() = state.navigate(MarrowRoute.CUSTOM_CREATION)
    fun mode() = state.navigate(MarrowRoute.CUSTOM_MODE)
    fun subjects() = state.navigate(MarrowRoute.CUSTOM_SUBJECTS)
    fun topics() = state.navigate(MarrowRoute.CUSTOM_TOPICS)
    fun tags() = state.navigate(MarrowRoute.CUSTOM_TAGS)
    fun addons() = state.navigate(MarrowRoute.CUSTOM_ADDONS)
    fun join() = state.navigate(MarrowRoute.CUSTOM_JOIN)
    fun play() = state.navigate(MarrowRoute.CUSTOM_PLAY)
    fun score() = state.navigate(MarrowRoute.CUSTOM_SCORE)
}