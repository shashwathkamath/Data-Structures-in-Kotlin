package DataStructures.Stack.Hard

import java.util.*

fun calculator(s: String): Int {
    var currNum = 0
    var result = 0
    var op = '+'
    val st = Stack<Int>()

    for ((i, c) in s.withIndex()) {
        when {
            c.isDigit() -> {
                currNum = currNum * 10 + (c - '0')
            }

            c == '+' || c == '-' -> {
                if (op == '+') result += currNum
                else result -= currNum
                op = c
                currNum = 0
            }

            c == '(' -> {
                st.push(result)
                st.push(if (op == '+') 1 else -1)
                result = 0
                op = '+'
            }

            c == ')' -> {
                if (op == '+') result += currNum
                else result -= currNum
                currNum = 0

                // ✅ Multiply with previous stored sign before `(`, and add back result
                result *= st.pop()
                result += st.pop()
            }
        }

    }
    return if (op == '+') result + currNum else result - currNum
}