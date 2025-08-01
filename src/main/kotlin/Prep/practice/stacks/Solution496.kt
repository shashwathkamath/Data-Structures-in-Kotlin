package Prep.practice.stacks

class Solution496 {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

        val st = ArrayDeque<Int>()
        val map = mutableMapOf<Int, Int>()

        nums1.forEach {
            map[it] = -1
        }

        for (i in nums2.size - 1 downTo 0) {
            while (st.isNotEmpty() && st.last() < nums2[i]) {
                st.removeLast()
            }
            if (st.isNotEmpty() && map.contains(nums2[i])) {
                map[nums2[i]] = st.last()
            }
            st.addLast(nums2[i])
        }

        return map.values.toIntArray()
    }
}
