package Prep.Meta

class Solution1249 {

    fun minRemoveToMakeValid(s: String): String {
        if (s.isEmpty()) return ""
        val openResult = helper(s, '(', ')')
        val closeResult = helper(openResult.reversed(), ')', '(')
        return closeResult.reversed()
    }

    private fun helper(s: String, open: Char, close: Char): String {
        val sb = StringBuilder()
        var balance = 0

        for (c in s) {
            when (c) {
                open -> balance++
                close -> {
                    if (balance == 0) {
                        continue
                    }
                    balance--
                }
            }
            sb.append(c)
        }
        return sb.toString()
    }
}