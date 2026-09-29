package com.deepaksah.marrow.rebuild

enum class MarrowThemeMode { SYSTEM, LIGHT, DARK }

data class ThemeState(
    val mode: MarrowThemeMode = MarrowThemeMode.SYSTEM
)