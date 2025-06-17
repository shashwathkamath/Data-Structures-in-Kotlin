package Prep

class Solution1249 {

    fun minRemoveToMakeValid(s: String): String {
        val updatedString = helper(s, '(', ')')
        val result = helper(updatedString.reverse().toString(), ')', '(')
        return result.reverse().toString()
    }

    private fun helper(s: String, open: Char, close: Char): StringBuilder {
        var balance = 0
        val sb = StringBuilder()
        for (c in s) {
            when (c) {
                open -> {
                    balance++
                }

                close -> {
                    if (balance == 0) continue
                    else balance--
                }

                else -> {}
            }
            sb.append(c)
        }
        return sb
    }
}