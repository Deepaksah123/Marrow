package com.deepaksah.marrow.rebuild

class NavigationController(private val state: MarrowStateStore) {
    fun go(route: MarrowRoute) { state.navigate(route) }
    fun back(): MarrowRoute? {
        val parent = state.session.route.parent ?: return null
        state.navigate(parent)
        return parent
    }
}