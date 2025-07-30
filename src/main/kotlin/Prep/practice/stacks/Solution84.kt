package Prep.practice.stacks

class Solution84 {

    fun largestRectangleArea(heights: IntArray): Int {
        val st = ArrayDeque<Int>()
        var area = 0
        var i = 0

        while (i <= heights.size) {
            val currentHeight = if (i < heights.size) heights[i] else 0
            if (st.isEmpty() || currentHeight >= heights[st.last()]) {
                st.add(i++)
            } else {
                val height = heights[st.removeLast()]
                val width = if (st.isEmpty()) i else i - st.last() - 1
                area = maxOf(area, height * width)
            }
        }

        return area
    }
}