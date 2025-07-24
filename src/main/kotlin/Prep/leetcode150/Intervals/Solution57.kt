package Prep.leetcode150.Intervals

class Solution57 {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val res = mutableListOf<IntArray>()
        var i = 0

        while (i < intervals.size && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i])
            i++
        }

        var newStart = newInterval[0]
        var newEnd = newInterval[1]

        while (i < intervals.size && intervals[i][0] <= newEnd) {
            newStart = minOf(newStart, intervals[i][0])
            newEnd = maxOf(newEnd, intervals[i][1])
            i++
        }

        res.add(intArrayOf(newStart, newEnd))
        while (i < intervals.size) {
            res.add(intervals[i])
            i++
        }

        return res.toTypedArray()
    }

}