package Prep.leetcode150.Intervals

class Solution452 {

    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortWith(
            compareBy { it[0] }
        )
        var start = points[0][0]
        var end = points[0][1]
        val arrows = mutableListOf<IntArray>()

        for (i in 1 until points.size) {
            val currentStart = points[i][0]
            val currentEnd = points[i][1]
            if (end > currentStart) {
                end = maxOf(currentEnd, end)
            } else {
                arrows.add(intArrayOf(start, end))
                start = currentStart
                end = currentEnd
            }
        }
        arrows.add(intArrayOf(start, end))

        return arrows.size
    }
}