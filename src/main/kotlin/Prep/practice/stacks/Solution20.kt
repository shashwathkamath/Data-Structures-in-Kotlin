package Prep.practice.stacks

class Solution20 {

    fun isValid(s: String): Boolean {

        val st = ArrayDeque<Char>()
        for (i in 0 until s.length) {
            val c = s[i]
            when {
                c == '(' || c == '[' || c == '{' -> {
                    st.addLast(c)
                }

                else -> {
                    if (st.isEmpty()) return false
                    else if ((c == ']' && st.last() == '[')
                        || (c == ')' && st.last() == '(')
                        || (c == '}' && st.last() == '{')
                    ) {
                        st.removeLast()
                    } else {
                        return false
                    }
                }
            }

        }
        return st.isEmpty()
    }
}