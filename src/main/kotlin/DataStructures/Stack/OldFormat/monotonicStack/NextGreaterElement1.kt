package DataStructures.Stack.OldFormat.monotonicStack

import java.util.*

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val st = Stack<Int>()
    val map = mutableMapOf<Int, Int>()

    for (num in nums2) {
        while (st.isNotEmpty() && st.peek() < num) {
            val smaller = st.pop()
            map[smaller] = num
        }
        st.push(num)
    }
    return nums1.map { map.getOrDefault(it, -1) }.toIntArray()
}