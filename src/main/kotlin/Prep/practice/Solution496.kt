package Prep.practice

class Solution496 {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

        val st = ArrayDeque<Int>()
        val hm = mutableMapOf<Int, Int>()

        nums2.forEach {
            while (st.isNotEmpty() && st.last() < it) {
                val prevSmallerElement = st.removeLast()
                hm[prevSmallerElement] = it
            }
            st.addLast(it)
        }

        return nums1.map {
            hm.getOrDefault(it, -1)
        }.toIntArray()
    }
}
