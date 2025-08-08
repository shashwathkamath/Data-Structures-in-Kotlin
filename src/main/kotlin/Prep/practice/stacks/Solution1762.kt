package Prep.practice.stacks

class Solution1762 {

    fun findBuildings(heights: IntArray): IntArray {
        val st = ArrayDeque<Int>()

        for (i in heights.size - 1 downTo 0) {
            if (st.isEmpty() || heights[i] > heights[st.last()]) {
                st.addLast(i)
            }
        }
        return st.reversed().toIntArray()
    }
}