package com.deepaksah.marrow.rebuild

class CustomModuleNavigator(private val state: MarrowStateStore) {
    fun intro() = state.navigate(MarrowRoute.CUSTOM_INTRO)
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