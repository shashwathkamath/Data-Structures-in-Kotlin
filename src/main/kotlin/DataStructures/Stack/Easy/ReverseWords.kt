package DataStructures.Stack.Easy

import java.util.*

fun reverseWords(s: String): String {
    val st = Stack<String>()
    val sb = StringBuilder()

    for (right in s.indices) {
        val c = s[right]
        if (c.isWhitespace()) {
            if (sb.isNotEmpty()) {
                st.push(sb.toString())
                sb.clear()
            }
        } else {
            sb.append(c)
        }
    }
    var ans = sb.toString()
    while (st.isNotEmpty()) {
        if (ans.isEmpty()) {
            ans += st.pop()
        } else {
            ans += " " + st.pop()
        }
    }
    return ans
}