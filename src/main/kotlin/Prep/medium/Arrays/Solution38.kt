package Prep.medium.Arrays

class Solution38 {

    fun countAndSay(n: Int): String {
        var s = "1"
        if (n == 1) return s

        for (i in 2..n) {
            s = generatePattern(s)
        }

        return s
    }

    private fun generatePattern(s: String): String {
        val sb = StringBuilder()
        var currentChar = s[0]
        var count = 1
        for (i in 1 until s.length) {
            if (currentChar == s[i]) {
                count++
            } else {
                sb.append(count).append(currentChar)
                currentChar = s[i]
                count = 1
            }
        }
        sb.append(count).append(currentChar)
        return sb.toString()
    }

}