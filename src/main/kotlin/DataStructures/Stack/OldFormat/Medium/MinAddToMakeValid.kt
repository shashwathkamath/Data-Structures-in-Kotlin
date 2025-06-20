package DataStructures.Stack.OldFormat.Medium

import java.util.Stack

fun minAddToMakeValid(s: String): Int {
    val st = Stack<Char>()

    for (c in s) {
        if (c == '(') {
            st.push(c)
        } else {
            if (st != null && st.peek() == '(') {
                st.pop()
            } else {
                st.push(c)
            }
        }
    }

    return st.size
}
/*
    val st = Stack<Int>()
    var countOpen = 0
    var add = 0

    for (c in s) {
        if (c == '(') {
            countOpen++
        } else {
            if (countOpen > 0) {
                countOpen--
            } else {
                add++
            }
        }
    }
    return countOpen + add
 */