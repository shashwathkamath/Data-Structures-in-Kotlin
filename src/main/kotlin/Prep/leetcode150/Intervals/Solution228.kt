package Prep.leetcode150.Intervals

class Solution228 {

    fun summaryRanges(nums: IntArray): List<String> {
        val res = mutableListOf<String>()
        if (nums.isEmpty()) return res

        var start = nums[0]
        var end = nums[0]

        for (i in 1 until nums.size) {
            if (nums[i] == end + 1) {
                end = nums[i]
            } else {
                if (start == end) {
                    res.add(start.toString())
                } else {
                    res.add("$start->$end")
                }

                start = nums[i]
                end = nums[i]
            }
        }
        if (start == end) {
            res.add(start.toString())
        } else {
            res.add("$start->$end")
        }

        return res
    }
}