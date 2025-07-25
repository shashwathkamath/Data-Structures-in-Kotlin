package DataStructures.TwoPointers

class Solution001 {

    fun palindromeChecker(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left] != s[right]) {
                return false
            }
            left++
            right--
        }

        return true
    }
}