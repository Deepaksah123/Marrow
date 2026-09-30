package com.deepaksah.marrow.rebuild

import android.content.Context
import android.graphics.Color
import android.view.View

object MarrowTheme {
    private const val PREFS = "marrow_preferences"
    private const val DARK = "dark_theme"

    fun isDark(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(DARK, false)

    fun setDark(context: Context, enabled: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putBoolean(DARK, enabled).apply()
    }

    fun toggle(context: Context): Boolean {
        val next = !isDark(context)
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putBoolean(DARK, next).apply()
        return next
    }

    fun background(context: Context): Int = if (isDark(context)) Color.rgb(21,36,39) else Color.rgb(247,247,247)
    fun surface(context: Context): Int = if (isDark(context)) Color.rgb(21,36,39) else Color.WHITE
    fun text(context: Context): Int = if (isDark(context)) Color.rgb(246,246,246) else Color.rgb(123,129,130)
    fun muted(context: Context): Int = if (isDark(context)) Color.rgb(170,183,186) else Color.rgb(139,150,152)

    fun apply(root: View, context: Context) {
        root.setBackgroundColor(background(context))
    }
}