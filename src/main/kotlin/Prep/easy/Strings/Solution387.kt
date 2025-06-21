package Prep.easy.Strings

class Solution387 {

    fun firstUniqChar(s: String): Int {
        var charArr = IntArray(26) { 0 }

        for (c in s) {
            charArr[c - 'a']++
        }
        for (i in s.indices) {
            if (charArr[s[i] - 'a'] == 1) {
                return i
            }
        }
        return -1
    }
}