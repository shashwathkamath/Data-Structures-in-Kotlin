package Prep

class Solution5 {
    private var start = 0
    private var maxLen = 0

    fun longestPalindrome(s: String): String {

        for (i in 0 until s.length) {
            helper(s, i, i)
            helper(s, i, i + 1)
        }

        return s.substring(start, start + maxLen)
    }

    private fun helper(s: String, left: Int, right: Int) {
        var l = left
        var r = right

        while (l >= 0 && r < s.length && s[l] == s[r]) {
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1
                start = l
            }
            l--
            r++
        }
    }
}