package com.deepaksah.marrow.rebuild

import android.content.res.AssetManager
import org.json.JSONObject

data class PearlSource(
    val title: String,
    val url: String,
    val alternateUrl: String
)

class PearlsAssetLoader(private val assets: AssetManager) {
    private val assetPath = "Marrow_pearls.html"

    fun load(): List<PearlSource> {
        val html = assets.open(assetPath).bufferedReader(Charsets.UTF_8).use { it.readText() }
        val marker = "const LECTURE_DATA = "
        val start = html.indexOf(marker)
        if (start < 0) return emptyList()

        val jsonStart = start + marker.length
        val jsonEnd = html.indexOf(";", jsonStart)
        if (jsonEnd < 0) return emptyList()

        val root = JSONObject(html.substring(jsonStart, jsonEnd).trim())
        val lectures = root.optJSONArray("lectures") ?: return emptyList()
        return buildList(lectures.length()) {
            for (i in 0 until lectures.length()) {
                val item = lectures.optJSONObject(i) ?: continue
                val title = item.optString("title").trim()
                val url = item.optString("pdf_downloadUrl").trim()
                val alternate = item.optString("pdf_downloadUrlx").trim()
                if (title.isNotBlank() && (url.isNotBlank() || alternate.isNotBlank())) {
                    add(PearlSource(title, url, alternate))
                }
            }
        }
    }
}
