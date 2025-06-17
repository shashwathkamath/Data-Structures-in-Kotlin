package Prep

class Solution14 {

    fun longestCommonPrefix(strs: Array<String>): String {
        var minLen = 0
        if (strs.size == 1) return strs[0]
        for (str in strs) {
            if (str.isEmpty()) return ""
            minLen = minOf(minLen, str.length)
        }

        //["flower","flow","flight"]

        for (i in 0 until minLen) {
            if (!isSameChar(strs, i)) {
                return strs[0].substring(0, i)
            }
        }
        return strs[0].substring(0, minLen)
    }

    fun isSameChar(strs: Array<String>, i: Int): Boolean {
        val firstString = strs[0]
        for (j in 1 until strs.size) {
            val currentString = strs[j]
            if (firstString[i] != currentString[i]) {
                return false
            }
        }

        return true
    }
}