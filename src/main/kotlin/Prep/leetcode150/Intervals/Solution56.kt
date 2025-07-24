package Prep.leetcode150.Intervals

class Solution56 {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val res = mutableListOf<IntArray>()
        if (intervals.isEmpty()) return res.toTypedArray()
        intervals.sortedWith(
            compareBy { it[0] }
        )
        var start = intervals[0][0]
        var end = intervals[0][1]

        for (i in 1 until intervals.size) {
            val currentStart = intervals[i][0]
            val currentEnd = intervals[i][1]
            if (end > currentStart) {
                end = maxOf(currentEnd, end)
            } else {
                res.add(intArrayOf(start, end))
                start = currentStart
                end = currentEnd
            }
        }
        res.add(intArrayOf(start, end))
        return res.toTypedArray()
    }
}