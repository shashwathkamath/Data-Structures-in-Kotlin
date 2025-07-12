package Prep.bloomberg.Arrays

class Solution1762 {

    fun findBuildings(heights: IntArray): IntArray {
        val res = mutableListOf<Int>()
        val st = ArrayDeque<Pair<Int, Int>>()

        for (i in 0 until heights.size) {
            while (st.isNotEmpty() && st.last().first <= heights[i]) {
                st.removeLast()
            }
            st.addLast(Pair(heights[i], i))
        }
        while (st.isNotEmpty()) {
            val index = st.removeFirst().second
            res.add(index)
        }

        return res.toIntArray()
    }


}

/*

 fun findBuildings(heights: IntArray): IntArray {
        var maxHeight = 0
        val res = mutableListOf<Int>()

        for (i in heights.size - 1 downTo 0) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i]
                res.add(i)
            }
        }

        return res.reversed().toIntArray()
    }

 */