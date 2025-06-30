package DataStructures.Stack.NewFormat

class Solution394 {
    //"3[a2[c]]"

    fun decodeString(s: String): String {
        val st = ArrayDeque<Pair<Int, StringBuilder>>()
        var currNum = 0
        var currString = StringBuilder()

        for (c in s) {
            when {
                c.isDigit() -> {
                    currNum = currNum * 10 + (c - '0')
                }

                c == '[' -> {
                    st.addLast(Pair(currNum, currString))
                    currNum = 0
                    currString = StringBuilder()
                }

                c == ']' -> {
                    val (num, prevString) = st.removeLast()
                    currString = StringBuilder(prevString).append(currString.toString().repeat(num))
                }

                else -> currString.append(c)
            }
        }

        return currString.toString()
    }
}