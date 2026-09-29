package com.deepaksah.marrow.rebuild

/**
 * Source-backed boundary for the recovered Video subsystem.
 *
 * The recovered APK contains landing, lesson-list, notes, downloaded-video,
 * revision-video and sample-video surfaces. Protected playback/session data
 * is not fabricated here.
 */
object VideoEvidence {
    val recoveredSurfaces = listOf(
        "landing",
        "lesson_list",
        "lesson_video",
        "notes",
        "downloaded_videos",
        "revision_videos",
        "sample_videos"
    )

    const val protectedContentPolicy =
        "Playback URLs, authentication/session state and protected media remain unresolved until proven by recovered content."
}
