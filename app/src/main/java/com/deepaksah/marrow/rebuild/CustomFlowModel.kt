package com.deepaksah.marrow.rebuild
data class CustomFlowModel(val stages:List<MarrowRoute>) {
    companion object { fun default()=CustomFlowModel(listOf(
        MarrowRoute.CUSTOM_INTRO,MarrowRoute.CUSTOM_CREATION,MarrowRoute.CUSTOM_MODE,
        MarrowRoute.CUSTOM_SUBJECTS,MarrowRoute.CUSTOM_TOPICS,MarrowRoute.CUSTOM_TAGS,
        MarrowRoute.CUSTOM_ADDONS,MarrowRoute.CUSTOM_JOIN,MarrowRoute.CUSTOM_PLAY,MarrowRoute.CUSTOM_SCORE
    ))}
}