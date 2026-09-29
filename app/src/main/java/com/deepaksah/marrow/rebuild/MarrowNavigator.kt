package com.deepaksah.marrow.rebuild

class MarrowNavigator(start: MarrowRoute = MarrowRoute.HOME) {
    private val stack = mutableListOf(start)

    val current: MarrowRoute get() = stack.last()
    val canGoBack: Boolean get() = stack.size > 1

    fun push(route: MarrowRoute) {
        if (route == current) return
        stack.add(route)
    }

    fun replace(route: MarrowRoute) {
        if (stack.isEmpty()) stack.add(route) else stack[stack.lastIndex] = route
    }

    fun back(): MarrowRoute {
        if (stack.size > 1) stack.removeAt(stack.lastIndex)
        return current
    }

    fun reset(route: MarrowRoute = MarrowRoute.HOME) {
        stack.clear()
        stack.add(route)
    }

    fun snapshot(): List<MarrowRoute> = stack.toList()

    fun restore(routes: List<MarrowRoute>) {
        stack.clear()
        if (routes.isEmpty()) stack.add(MarrowRoute.HOME)
        else stack.addAll(routes)
    }
}
