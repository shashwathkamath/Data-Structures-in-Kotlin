package DataStructures.Stack.OldFormat.Medium

import java.util.Stack

fun redundantParentheses(s: String): Boolean {
    val st = Stack<Char>()
    for (c in s) {

        if (c == ')') {
            var top = st.pop()
            var hasOperator = false
            while (top != '(') {
                if (top == '+' || top == '-' || top == '*' || top == '/') {
                    hasOperator = true
                }
                top = st.pop()
            }
            if (!hasOperator) {
                return true
            }
        } else {
            st.push(c)
        }
    }
    return false
}