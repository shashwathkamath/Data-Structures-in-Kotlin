package Algorithms.Greedy

class Solution435 {

    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        intervals.sortWith(compareBy { it[0] })
        var count = 0
        var lastEnd = Int.MIN_VALUE

        for (interval in intervals) {
            if (interval[0] >= lastEnd) {
                lastEnd = interval[1]
            } else {
                count++
            }
        }

        return count
    }

}