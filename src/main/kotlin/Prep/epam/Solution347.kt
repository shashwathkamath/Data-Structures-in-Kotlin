package Prep.epam

import java.util.*

class Solution347 {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        val pq = PriorityQueue<Map.Entry<Int, Int>>(compareBy { it.value })
        map.entries.forEach {
            pq.add(it)
            if (pq.size > k) {
                pq.poll()
            }
        }
        val res = mutableListOf<Int>()
        pq.forEach {
            res.add(it.key)
        }
        return res.toIntArray()
    }
}