package Algorithms.Backtracking.UncontrolledEnumeration

class Solution17 {
    private val phoneData = arrayOf<String>(
        "", "",
        "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        var res = mutableListOf<String>()
        if (digits.isEmpty()) return res
        val sb = StringBuilder()

        fun backtrack(i: Int) { //2,3
            if (i == digits.length) {
                res.add(sb.toString())
                return
            }
            val currentStrings = phoneData[digits[i] - '0']
            for (j in currentStrings.indices) {
                sb.append(currentStrings[j])
                backtrack(i + 1)
                sb.deleteAt(sb.length - 1)
            }
        }
        backtrack(0)
        return res
    }
}