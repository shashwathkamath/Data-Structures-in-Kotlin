package DataStructures.Stack.Medium

import java.util.Stack

fun evalRPN(tokens:Array<String>):Int{
    val set = mutableSetOf<String>("+", "-", "*", "/")
    val stack = Stack<Int>()

    for (token in tokens){
        if (token in set){
            val secondOperand = stack.pop()
            val firstOperand = stack.pop()
            val tempRes = when(token){
                "+" -> firstOperand + secondOperand
                "-" -> firstOperand - secondOperand
                "*" -> firstOperand * secondOperand
                "/" -> firstOperand / secondOperand
                else -> 0
            }
            stack.push(tempRes)
        }
        else{
            val element = token.toInt()
            stack.push(element)
        }
    }
    return if (stack.isNotEmpty()) stack.peek() else 0
}