package com.deepaksah.marrow.rebuild
object BookmarkNavigationModel {
    fun ids(state:MarrowStateStore):List<String> =
        state.session.mcqIds.filter { state.session.answers[it]?.isStarred==true }
}