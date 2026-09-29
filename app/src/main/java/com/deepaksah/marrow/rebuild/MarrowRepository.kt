package com.deepaksah.marrow.rebuild

import android.content.Context

class MarrowRepository(private val context: Context) {
    fun listContentAssets(): List<String> =
        runCatching { context.assets.list("")?.toList().orEmpty() }.getOrDefault(emptyList())

    fun readAsset(path: String): String =
        context.assets.open(path).bufferedReader().use { it.readText() }
}
