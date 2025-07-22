package Prep.leetcode150.Stacks

class Solution150 {

    fun evalRPN(tokens: Array<String>): Int {
        val st = ArrayDeque<Int>()
        val set = mutableSetOf("+", "-", "/", "*")

        var result = 0
        tokens.forEach { token ->
            if (token in set) {
                val b = st.removeLast()
                val a = st.removeLast()
                result = when (token) {
                    "+" -> {
                        a + b
                    }

                    "-" -> {
                        a + b
                    }

                    "*" -> {
                        a * b
                    }

                    "/" -> {
                        a / b
                    }

                    else -> 0
                }
                st.addLast(result)
            } else {
                st.addLast(token.toInt())
            }
        }

        return if (st.isNotEmpty()) st.last() else 0
    }
}