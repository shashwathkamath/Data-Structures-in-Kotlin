package DataStructures.heaps.practice

import java.util.*

class Solution215 {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>()

        nums.forEach { num ->
            pq.add(num)
            if (pq.size > k) pq.poll()
        }
        return pq.peek()
    }
}