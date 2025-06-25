package Prep.easy.Others

class Solution20 {

    fun isValid(s: String): Boolean {
        val map = mapOf<Char, Char>(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        val st = ArrayDeque<Char>()

        for (c in s) {
            when {
                st.isNotEmpty() && st.last() == map[c] -> st.removeLast()
                else -> st.addLast(c)
            }
        }

        return st.isEmpty()
    }
}