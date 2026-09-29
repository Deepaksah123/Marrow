package com.deepaksah.marrow.rebuild

import android.content.res.AssetManager
import org.json.JSONObject

class MarrowJsonImporter(private val assets: AssetManager) {
    fun loadEdition8QBank(): Map<String, List<McqContent>> {
        val root = "marrow_content/Brain/Marrow/Edition 8 qBank"
        val modules = LinkedHashMap<String, List<McqContent>>()
        loadTree(root, modules)
        return modules
    }

    private fun loadTree(path: String, modules: MutableMap<String, List<McqContent>>) {
        assets.list(path).orEmpty().forEach { name ->
            val child = path + "/" + name
            val children = assets.list(child).orEmpty()
            if (children.isNotEmpty()) {
                loadTree(child, modules)
            } else if (name.endsWith(".json", ignoreCase = true)) {
                val relative = child.removePrefix("marrow_content/Brain/Marrow/Edition 8 qBank/").removeSuffix(".json")
                val subject = relative.substringBefore("/")
                if (subject.isBlank()) return@forEach
                val moduleName = relative.substringAfter("/").ifBlank { name.removeSuffix(".json") }
                val moduleId = subject + "/" + moduleName
                val questions = parseFile(child, subject)
                if (questions.isNotEmpty()) modules[moduleId] = questions
            }
        }
    }

    private fun parseFile(path: String, subject: String): List<McqContent> {
        val text = assets.open(path).bufferedReader(Charsets.UTF_8).use { it.readText() }
        val root = JSONObject(text)
        val array = root.optJSONArray("questions") ?: return emptyList()
        val result = ArrayList<McqContent>(array.length())

        for (i in 0 until array.length()) {
            val q = array.optJSONObject(i) ?: continue
            val choices = ArrayList<QChoice>()
            val choicesArray = q.optJSONArray("choices")
            if (choicesArray != null) {
                for (j in 0 until choicesArray.length()) {
                    val c = choicesArray.optJSONObject(j) ?: continue
                    choices += QChoice(id = c.opt("id")?.toString() ?: (j + 1).toString(), text = c.optString("text", ""))
                }
            }
            val questionId = q.optString("question_id").ifBlank { "q_" + (i + 1) }
            result += McqContent(
                id = questionId,
                text = q.optString("text", ""),
                choices = choices,
                correctChoiceId = if (q.has("correct_choice_id")) q.opt("correct_choice_id")?.toString() else null,
                solution = q.optString("solution", ""),
                displayId = questionId,
                tags = listOf("marrow", "qbank", "edition8", subject)
            )
        }
        return result.filter { it.text.isNotBlank() && it.choices.isNotEmpty() }
    }
}
