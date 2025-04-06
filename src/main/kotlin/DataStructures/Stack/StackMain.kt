package DataStructures.Stack

import DataStructures.Stack.monotonicStack.dailyTemperatures

fun main() {
//    val exp = "3 + (1 + 2)"
//    println("Result --> ${calculator(exp)}")

//    val str = "lee(t(c)o)de)"
//    println("removeParanthesis --> ${minRemoveToMakeValid(str)}")

    val temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
    dailyTemperatures(temperatures).forEach {
        println(it)
    }
    
}
