package com.deepaksah.marrow.rebuild

data class ProfileSettingsState(
    val theme: ThemeState = ThemeState(),
    val vibrationEnabled: Boolean = false
)