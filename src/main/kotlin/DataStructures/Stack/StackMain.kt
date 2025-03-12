package DataStructures.Stack

import DataStructures.Stack.Basics.Stack

fun main(){
    val st = Stack(3)
    st.push(1)
    st.push(4)
    st.push(5)
    st.pop()
    st.push(7)
    val topIndex = st.top()
    println("Size of Stack --> ${st.size()}, topElement is $topIndex")
}