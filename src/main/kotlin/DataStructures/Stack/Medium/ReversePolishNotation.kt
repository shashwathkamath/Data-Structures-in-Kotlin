package DataStructures.Stack.Medium

import java.util.Stack

fun evalRPN(tokens:Array<String>):Int{
   val operators = mutableSetOf<String>("+","-","*","/")
    val st = Stack<Int>()

    for (token in tokens){
        if (token in operators){
            val secondOperand = st.pop()
            val firstOperand = st.pop()
            val result = when(token){
                "+" -> firstOperand + secondOperand
                "-" -> firstOperand - secondOperand
                "*" -> firstOperand * secondOperand
                "/" -> firstOperand / secondOperand
                else -> 0
            }
            st.push(result)
        }
        else{
            st.push(token.toInt())
        }
    }
    return if (st.isNotEmpty())st.peek() else 0
}