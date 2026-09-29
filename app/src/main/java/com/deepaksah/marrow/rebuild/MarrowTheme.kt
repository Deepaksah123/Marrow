package com.deepaksah.marrow.rebuild

import android.content.Context
import android.graphics.Color
import android.view.View

object MarrowTheme {
    private const val PREFS = "marrow_preferences"
    private const val DARK = "dark_theme"

    fun isDark(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(DARK, false)

    fun toggle(context: Context): Boolean {
        val next = !isDark(context)
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putBoolean(DARK, next).apply()
        return next
    }

    fun background(context: Context): Int = if (isDark(context)) Color.rgb(18,18,18) else Color.rgb(245,245,245)
    fun surface(context: Context): Int = if (isDark(context)) Color.rgb(30,30,30) else Color.WHITE
    fun text(context: Context): Int = if (isDark(context)) Color.WHITE else Color.rgb(25,25,25)
    fun muted(context: Context): Int = if (isDark(context)) Color.rgb(180,180,180) else Color.rgb(100,100,100)

    fun apply(root: View, context: Context) {
        root.setBackgroundColor(background(context))
    }
}
