package Prep.easy.Strings

class Solution125 {

    fun isPalindrome(s: String): Boolean {
        val filteredString = s.filter { it.isLetterOrDigit() }.lowercase()
        var i = 0
        var j = filteredString.length - 1
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