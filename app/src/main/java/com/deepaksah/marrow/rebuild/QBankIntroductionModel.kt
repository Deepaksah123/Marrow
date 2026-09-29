package com.deepaksah.marrow.rebuild

/**
 * Source-backed state for the recovered QBank introduction.
 * The recovered ViewModel requires lesson_id and also accepts source/analytics_source.
 * Optional UI state includes an enabled flag and a selected PublicKeyCredentialType state.
 */
data class QBankIntroductionModel(
    val lessonId: String,
    val source: Int = 0,
    val analyticsSource: Int = 0,
    val enabled: Boolean = true
)