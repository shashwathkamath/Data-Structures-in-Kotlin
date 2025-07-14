package Prep.leetcode150.TwoPointers

class Solution125 {

    fun isPalindrome(s: String): Boolean {
        var filteredString = s.filter { it.isLetterOrDigit() }.lowercase()
        var i = 0
        var j = s.length - 1

        while (i < j) {
            if (filteredString[i] != filteredString[j]) {
                return false
            }
            i++
            j--
        }

        return true
    }
}