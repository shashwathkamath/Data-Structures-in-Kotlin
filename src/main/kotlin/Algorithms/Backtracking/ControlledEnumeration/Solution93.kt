package Algorithms.Backtracking.ControlledEnumeration

//s = "25525511135"

class Solution93 {

    fun restoreIpAddresses(s: String): List<String> {
        val res = mutableListOf<String>()

        fun isValid(s: String): Boolean {
            return when {
                s.isEmpty() || s.length > 3 -> false
                s.length > 1 && s[0] == '0' -> false
                else -> s.toInt() in 0..255
            }
        }

        fun backtrack(index: Int, parts: MutableList<String>) {
            if (parts.size == 4) {
                if (index == s.length) {
                    res.add(parts.joinToString("."))
                }
                return
            }
            for (i in index until minOf(s.length, index + 3)) {
                val part = s.substring(index, i + 1)
                if (isValid(part)) {
                    parts.add(part)
                    backtrack(i + 1, parts)
                    parts.removeAt(parts.size - 1)
                }
            }
        }
        backtrack(0, mutableListOf())
        return res
    }
}