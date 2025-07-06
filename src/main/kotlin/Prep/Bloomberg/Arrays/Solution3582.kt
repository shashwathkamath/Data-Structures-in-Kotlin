package Prep.Bloomberg.Arrays

class Solution3582 {

    fun generateTag(caption: String): String {
        val sb = StringBuilder()
        val trimmedCaption = caption.trim()
        val words: List<String> = trimmedCaption.split(" ")

        words.forEachIndexed { index, word ->
            if (index == 0) {

                sb.append(if (word.isEmpty()) "#" else "#${word.lowercase()}")
            } else {
                sb.append(word.lowercase().replaceFirstChar { it.uppercase() })
            }
        }

        return if (sb.length > 100) sb.substring(0, 100) else sb.toString()
    }
}