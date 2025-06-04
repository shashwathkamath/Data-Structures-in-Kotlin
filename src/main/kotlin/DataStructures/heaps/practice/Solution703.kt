package DataStructures.heaps.practice

import java.util.*

class Solution703 {

}

class KthLargest(k: Int, nums: IntArray) {

    private val pq = PriorityQueue<Int>(k)
    private val size = k

    init {
        nums.forEach {
            pq.add(it)
            if (pq.size > k) {
                pq.poll()
            }
        }
    }

    fun add(`val`: Int): Int {
        pq.add(`val`)
        if (pq.size > size) {
            pq.poll()
        }
        return pq.peek()
    }
}