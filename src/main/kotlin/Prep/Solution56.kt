package Prep

class Solution56 {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isEmpty()) return intervals
        intervals.sortWith(compareBy { it[0] })

        val res = mutableListOf<IntArray>()
        var currentInterval = intervals[0].copyOf()

        for (i in 1 until intervals.size) {
            val currentEndTime = currentInterval[1]
            val nextStartTime = intervals[i][0]
            val nextEndTime = intervals[i][1]

            if (currentEndTime >= nextStartTime) {
                currentInterval[1] = maxOf(currentEndTime, nextEndTime)
            } else {
                res.add(currentInterval)
                currentInterval = intervals[i].copyOf()
            }
        }
        res.add(currentInterval)
        return res.toTypedArray()
    }
}