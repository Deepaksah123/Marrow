package com.deepaksah.marrow.rebuild

data class ReviewSnapshot(
    val filter: ReviewFilter = ReviewFilter.ALL,
    val questionIds: List<String> = emptyList(),
    val selectedIndex: Int = 0
)