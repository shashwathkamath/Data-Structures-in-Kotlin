package Prep.epam

class Solution22 {
    fun generateParenthesis(n: Int): List<String> {
        val sb = StringBuilder()
        val res = mutableListOf<String>()

        fun backtrack(sb: StringBuilder, open: Int, close: Int) {

            if (sb.length == 2 * n) {
                res.add(sb.toString())
                return
            }
            if (open < n) {
                sb.append("(")
                backtrack(sb, open + 1, close)
                sb.deleteAt(sb.length - 1)
            }
            if (close < open) {
                sb.append(")")
                backtrack(sb, open, close + 1)
                sb.deleteAt(sb.length - 1)
            }
        }

        backtrack(sb, 0, 0)
        return res
    }
}