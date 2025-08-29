package Prep.trending.amazon

import java.util.*

class Solution253 {

    fun minMeetingRooms(intervals: Array<IntArray>): Int {

        if (intervals.isEmpty()) return 0
        intervals.sortBy { it[0] }

        val pq = PriorityQueue<Int>()
        pq.add(intervals[0][1])

        for (i in 1 until intervals.size) {
            val currentStartTime = intervals[i][0]
            val currentEndTime = intervals[i][1]
            if (currentStartTime >= pq.peek()) {
                pq.poll()
            }
            pq.add(currentEndTime)

        }
        return pq.size
    }
}