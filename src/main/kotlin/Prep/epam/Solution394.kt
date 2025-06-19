package Prep.epam

class Solution394 {

    fun decodeString(s: String): String {
        val numStack = ArrayDeque<Int>()
        val stringStack = ArrayDeque<StringBuilder>()
        val currentString = StringBuilder()
        var num = 0

        for (c in s) {
            when {
                c.isDigit() -> {
                    num = num * 10 + c.code
                }

                c == '[' -> {
                    numStack.addLast(num)
                    stringStack.addLast(StringBuilder(currentString))
                    num = 0
                    currentString.clear()
                }

                c == ']' -> {
                    val num = numStack.removeLast()
                    val cachedString = stringStack.removeLast()
                    val decoded = cachedString.toString().repeat(num)
                    currentString.clear().append(cachedString).append(decoded)
                }

                else -> {
                    currentString.append(c)
                }
            }
        }
        return currentString.toString()
    }
}