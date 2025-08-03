package Prep.practice.stacks

class Solution155 {

}

class MinStack() {

    private val st = ArrayDeque<Pair<Int, Int>>()

    fun push(`val`: Int) {

        if (st.isNotEmpty()) {
            val min = minOf(st.last().second, `val`)
            st.addLast(Pair(`val`, min))
        } else {
            st.addLast(Pair(`val`, `val`))
        }
    }

    fun pop() {
        if (st.isNotEmpty()) st.removeLast()
    }

    fun top(): Int {
        return if (st.isNotEmpty()) st.last().first else -1
    }

    fun getMin(): Int {
        return if (st.isNotEmpty()) st.last().second else -1
    }

}