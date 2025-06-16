package Prep

import java.util.*

class Solution349 {

    fun decodeString(s: String): String {
        //"3[a]2[bc]"
        val numStack = ArrayDeque<Int>()
        val stringStack = ArrayDeque<StringBuilder>()
        val currentString = StringBuilder()
        var currNum = 0

        for (c in s) {
            when {
                c.isDigit() -> {
                    currNum = currNum * 10 + (c - '0')
                }

                c == '[' -> {
                    numStack.addLast(currNum)
                    stringStack.addLast(currentString)
                    currNum = 0
                    currentString.clear()
                }

                c == ']' -> {
                    val num = numStack.removeLast()
                    val prevString = stringStack.removeLast()
                    val decodedString = prevString.toString().repeat(num)
                    currentString.clear().append(prevString).append(decodedString)
                }

                else -> {
                    currentString.append(c)
                }
            }
        }

        return currentString.toString()
    }
}