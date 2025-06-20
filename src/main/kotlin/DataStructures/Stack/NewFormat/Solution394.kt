package DataStructures.Stack.NewFormat

class Solution394 {

    fun decodeString(s: String): String {
        val st = ArrayDeque<Any>()
        var currString = StringBuilder()
        var currNum = 0

        for (char in s) {
            when {
                char.isDigit() -> {
                    currNum = currNum * 10 + char.code
                }

                char == '[' -> {
                    st.addLast(currNum)
                    st.addLast(currString.toString())
                    currNum = 0
                    currString = StringBuilder()
                }

                char == ']' -> {
                    val str = st.removeLast() as String
                    val num = st.removeLast() as Int
                    currString = StringBuilder(str).append(currString.toString().repeat(num))
                }

                else -> {
                    currString.append(char)
                }
            }
        }

        return currString.toString()
    }
}