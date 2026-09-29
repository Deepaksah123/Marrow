package com.deepaksah.marrow.rebuild

data class NavigationSnapshot(
    val route: MarrowRoute,
    val subjectId: String?,
    val moduleId: String?,
    val questionIndex: Int,
    val testId: String?,
    val testIndex: Int
)