package Prep.epam

class Solution205 {

    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sArray = IntArray(128) { -1 }
        val tArray = IntArray(128) { -1 }

        for (i in s.indices) {
            val sCharIndex = s[i].code
            val tCharIndex = t[i].code

            if (sArray[sCharIndex] == -1) sArray[sCharIndex] = i
            if (tArray[tCharIndex] == -1) tArray[tCharIndex] = i

            if (sArray[sCharIndex] != tArray[tCharIndex]) return false
        }

        return true
    }
}