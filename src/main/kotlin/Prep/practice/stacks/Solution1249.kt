package Prep.practice.stacks

class Solution1249 {

    fun minRemoveToMakeValid(s: String): String {

        fun helper(s: String, open: Char, close: Char): String {
            var balance = 0
            val sb = StringBuilder()

            for (c in s) {
                when (c) {
                    open -> balance++
                    close -> {
                        if (balance == 0) continue
                        balance--
                    }
                }
                sb.append(c)
            }

            return sb.toString()
        }

        val closedProcessedString = helper(s, '(', ')')
        val openProcessedString = helper(closedProcessedString.reversed(), ')', '(')
        return openProcessedString.reversed()
    }
}