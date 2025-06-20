package DataStructures.Stack.OldFormat.Easy

import java.util.*

fun isValid(s: String): Boolean {
    val map = mutableMapOf<Char, Char>()
    map[')'] = '('
    map['}'] = '{'
    map[']'] = '['
    val st = Stack<Char>()

    for (c in s) {
        //()[]
        if (st.isNotEmpty() && st.peek() == map[c]) {
            st.pop()
        } else {
            st.push(c)
        }
    }

    return st.isEmpty()
}