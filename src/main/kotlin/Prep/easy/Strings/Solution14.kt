package Prep.easy.Strings

class Solution14 {

    fun longestCommonPrefix(strs: Array<String>): String {
        var minLen = Int.MAX_VALUE
        if (strs.size == 1) return strs[0]

        strs.forEach {
            if (it.isEmpty()) return ""
            minLen = minOf(minLen, it.length)
        }

        for (i in 0 until minLen) {
            if (!checkPrefix(i, strs)) {
                return strs[0].substring(0, i)
            }
        }

        return strs[0].substring(0, minLen)
    }

    private fun checkPrefix(index: Int, strs: Array<String>): Boolean {
        var currentIndex = index
        var currentString = strs[0]

        for (i in 1 until strs.size) {
            if (currentString[currentIndex] != strs[i][currentIndex]) {
                return false
            }
        }

        return true
    }
}