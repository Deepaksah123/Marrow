package com.deepaksah.marrow.rebuild

data class CustomModuleSelectionModel(
    val subjects: Set<String> = emptySet(),
    val topics: Set<String> = emptySet(),
    val tags: Set<String> = emptySet(),
    val addOns: Set<String> = emptySet()
) {
    fun withSubject(id: String) = copy(subjects = subjects.toggle(id))
    fun withTopic(id: String) = copy(topics = topics.toggle(id))
    fun withTag(id: String) = copy(tags = tags.toggle(id))
    fun withAddOn(id: String) = copy(addOns = addOns.toggle(id))

    private fun Set<String>.toggle(id: String): Set<String> =
        if (contains(id)) this - id else this + id
}
