package Prep.leetcode150

class Solution58 {

    fun lengthOfLastWord(s: String): Int {
        var i = s.length - 1
        while (i >= 0 && s[i] == ' ') {
            i--
        }

        var length = 0
        while (i >= 0 && s[i] != ' ') {
            length++
            i--
        }

        return length
    }
}