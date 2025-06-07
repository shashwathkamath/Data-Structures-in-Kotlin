package DataStructures.Heaps.fundamentals

import java.util.*

class Solution347 {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        val pq = PriorityQueue<Map.Entry<Int, Int>>(compareBy { it.value })
        map.forEach { entry ->
            pq.add(entry)
            if (pq.size > k) {
                pq.poll()
            }
        }
        val res = mutableListOf<Int>()
        while (pq.isNotEmpty()) {
            val element = pq.poll().key
            res.add(element)
        }
        return res.toIntArray()
    }
}