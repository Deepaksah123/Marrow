package com.deepaksah.marrow.rebuild

data class VideoContentModel(
    val subjectId: String?,
    val lessonIds: List<String>,
    val notesAvailable: Boolean,
    val downloadedListAvailable: Boolean,
    val revisionListAvailable: Boolean,
    val sampleListAvailable: Boolean
) {
    companion object {
        fun empty(subjectId: String? = null) = VideoContentModel(
            subjectId = subjectId,
            lessonIds = emptyList(),
            notesAvailable = true,
            downloadedListAvailable = true,
            revisionListAvailable = true,
            sampleListAvailable = true
        )
    }
}
