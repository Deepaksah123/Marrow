package com.deepaksah.marrow.rebuild

data class ContentImportResult(
    val modulesImported: Int,
    val questionsImported: Int,
    val errors: List<String>
) {
    val success: Boolean get() = errors.isEmpty()
}