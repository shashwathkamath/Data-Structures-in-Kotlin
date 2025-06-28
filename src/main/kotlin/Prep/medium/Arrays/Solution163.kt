package Prep.medium.Arrays

class Solution163 {

    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()

        if (nums.isEmpty()) {
            if (lower <= upper) {
                res.add(listOf(lower, upper))
            }
            return res
        }

        if (nums[0] > lower) {
            res.add(listOf(lower + 1, nums[0] - 1))
        }

        for (i in 0 until nums.size - 1) {
            if (nums[i + 1] - nums[i] > 1) {
                res.add(listOf(nums[i] + 1, nums[i + 1] - 1))
            }
        }

        if (nums[nums.size - 1] < upper) {
            res.add(listOf(nums[nums.size - 1] + 1, upper))
        }

        return res
    }
}