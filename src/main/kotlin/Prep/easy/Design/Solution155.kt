package Prep.easy.Design

class Solution155 {

    private val st = ArrayDeque<Int>()
    private val minSt = ArrayDeque<Int>()


    fun push(`val`: Int) {
        st.addLast(`val`)
        if (minSt.isEmpty() || minSt.last() >= `val`) {
            minSt.addLast(`val`)
        }
    }

    fun pop() {
        if (st.isNotEmpty()) {
            val mainLastElement = st.removeLast()
            if (mainLastElement == minSt.last()) {
                minSt.removeLast()
            }
        }
    }

    fun top(): Int {
        return if (st.isNotEmpty()) st.last() else -1
    }

    fun getMin(): Int {
        return if (minSt.isNotEmpty()) minSt.last() else -1
    }
}