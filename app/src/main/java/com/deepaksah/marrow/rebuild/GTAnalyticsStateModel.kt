package com.deepaksah.marrow.rebuild

/**
 * Source-backed state model for the recovered Grand-Test Analytics surface.
 *
 * The recovered GTAnalyticsViewModel state is:
 * - restrictedSubjects: List<String>
 * - gtAnalyticsData: createHandlerForCurrentOrMainLooper? (server/domain payload)
 * - sort: SubjectSort
 * - metric: SubjectMetric
 * - limit: Int, default 20
 * - selectedIndex: Int, default -1
 * - popupVisible: Boolean, default true in the recovered constructor
 *
 * The domain payload and obfuscated enum members are intentionally not fabricated here.
 */
data class GTAnalyticsStateModel(
    val restrictedSubjects: List<String> = emptyList(),
    val analyticsPayloadAvailable: Boolean = false,
    val sortState: String = "recovered default",
    val metricState: String = "recovered default",
    val limit: Int = 20,
    val selectedIndex: Int = -1,
    val popupVisible: Boolean = true
) {
    fun summary(): String = buildString {
        append("Recovered GT analytics state")
        append("\nSort: ").append(sortState)
        append("\nMetric: ").append(metricState)
        append("\nLimit: ").append(limit)
        append("\nSelected index: ").append(selectedIndex)
        append("\nPopup visible: ").append(popupVisible)
        append("\nAnalytics payload: ")
        append(if (analyticsPayloadAvailable) "available" else "not available in local reconstruction")
    }
}
