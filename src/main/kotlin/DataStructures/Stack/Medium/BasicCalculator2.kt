package DataStructures.Stack.Medium

import java.util.Stack

fun calculate(s: String): Int {
    var currNum = 0
    var op = '+'
    val st = Stack<Int>()

    for (i in s.indices){
        val c = s[i]
        if (c.isDigit()){
            currNum = currNum * 10 + (c - '0')
        }
        if ((!c.isDigit() && !c.isWhitespace()) || i == s.lastIndex){
            when(op){
                '+' ->{
                    st.push(currNum)
                }
                '-' ->{
                    st.push(-currNum)
                }
                '*' ->{
                    val element = st.pop() * currNum
                    st.push(element)
                }
                '/' ->{
                    val element = st.pop() / currNum
                    st.push(element)
                }
            }
            op = c
            currNum = 0
        }
    }
    return st.sum()
}