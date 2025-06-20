package DataStructures.Stack.OldFormat.Medium

import java.util.Stack

fun evalPN(tokens: Array<String>): Int {
    println("Inside this method")
    val operators = setOf("+", "-", "*", "/")
    val st = Stack<Int>()
    val n = tokens.size

    for (i in n - 1..0) {
        println(i)
        val token = tokens[i]
        if (token in operators) {
            val secondOperand = st.pop()
            val firstOperand = st.pop()
            val result = when (token) {
                "+" -> firstOperand + secondOperand
                "-" -> firstOperand - secondOperand
                "*" -> firstOperand * secondOperand
                "/" -> firstOperand / secondOperand
                else -> 0
            }
            st.push(result)
        } else {
            st.push(token.toInt())
        }
    }

    return if (st.isNotEmpty()) st.peek() else 0
}