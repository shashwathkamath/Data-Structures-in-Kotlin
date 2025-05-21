package Algorithms.Backtracking.UncontrolledEnumeration

class Solution784 {

    fun letterCasePermutation(s: String): List<String> {
        val result = mutableListOf<String>()
        val current = s.toCharArray()

        fun backtrack(i: Int) {
            if (i == s.length) {
                result.add(String(current))
                return
            }
            backtrack(i + 1)
            if (current[i].isLetter()) {
                current[i] = if (current[i].isLowerCase()) {
                    current[i].uppercaseChar()
                } else {
                    current[i].lowercaseChar()
                }
                backtrack(i + 1)
                current[i] = if (current[i].isLowerCase()) {
                    current[i].uppercaseChar()
                } else {
                    current[i].lowercaseChar()
                }
            }
        }
        backtrack(0)
        return result
    }
}