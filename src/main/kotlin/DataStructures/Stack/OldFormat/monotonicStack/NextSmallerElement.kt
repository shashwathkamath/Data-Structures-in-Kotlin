package DataStructures.Stack.OldFormat.monotonicStack

import java.util.*

fun nextSmallerElement(nums1: IntArray, nums2: IntArray): IntArray {
    val st = Stack<Int>()
    val hm = mutableMapOf<Int, Int>()

    for (num in nums2) {
        while (st.isNotEmpty() && st.peek() > num) {
            val greater = st.pop()
            hm[greater] = num
        }
        st.push(num)
    }
    return nums1.map { hm.getOrDefault(it, -1) }.toIntArray()
}