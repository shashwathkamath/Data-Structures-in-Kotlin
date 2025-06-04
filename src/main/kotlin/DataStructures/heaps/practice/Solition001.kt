package DataStructures.heaps.practice

import java.util.*

class Solition001 {

    fun kSortedArraySorting(nums: IntArray, k: Int) {
        val pq = PriorityQueue<Int>(k)
        var i = 0
        nums.forEach {
            pq.add(it)
            if (pq.size > k) {
                nums[i++] = pq.poll()
            }
        }

        while (pq.isNotEmpty()) {
            nums[i++] = pq.poll()
        }
    }
}