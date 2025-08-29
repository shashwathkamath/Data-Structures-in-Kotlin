package Prep.trending.amazon

import java.util.*

class Solution767 {

    fun reorganizeString(s: String): String {
        if (s.isEmpty()) return ""
        val map = mutableMapOf<Char, Int>()
        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        val pq = PriorityQueue<Char>() { a, b -> map[b]!! - map[a]!! }
        pq.addAll(map.keys)

        val sb = StringBuilder()

        while (pq.size > 1) {
            val current = pq.poll()
            val next = pq.poll()
            sb.append(current)
            sb.append(next)
            map[current] = map[current]!! - 1
            map[next] = map[next]!! - 1
            if (map[current]!! > 0) {
                pq.add(current)
            }
            if (map[next]!! > 0) {
                pq.add(next)
            }
        }
        if (pq.isNotEmpty()) {
            val remainderChar = pq.poll()
            if (map[remainderChar]!! > 1) {
                return ""
            } else {
                sb.append(remainderChar)
            }
        }

        return sb.toString()
    }
}