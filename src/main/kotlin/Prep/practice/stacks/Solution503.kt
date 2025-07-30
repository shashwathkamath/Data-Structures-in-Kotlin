package Prep.practice.stacks

class Solution503 {

    fun nextGreaterElements(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n) { -1 }
        val st = ArrayDeque<Int>()
        var i = 0

        while (i < 2 * n) {
            val currentElement = nums[i % n]
            while (st.isNotEmpty() && currentElement < nums[st.last()]) {
                val indexSmallerElement = st.removeLast()
                res[indexSmallerElement] = currentElement
            }
            if (i < n) {
                st.addLast(i)
            }
            i++
        }

        return res
    }
}