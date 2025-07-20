package Prep.leetcode150.HashMap

class Solution205 {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sArr = IntArray(128) { -1 }
        val tArr = IntArray(128) { -1 }

        for (i in s.indices) {
            val sCharIndex = s[i].code
            val tCharIndex = t[i].code
            if (sArr[sCharIndex] == -1) sArr[sCharIndex] = i
            if (tArr[tCharIndex] == -1) tArr[tCharIndex] = i
            if (sArr[sCharIndex] != tArr[tCharIndex]) return false
        }

        return true
    }
}