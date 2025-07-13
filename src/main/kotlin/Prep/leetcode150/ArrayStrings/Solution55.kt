package Prep.leetcode150.ArrayStrings

class Solution55 {

    fun canJump(nums: IntArray): Boolean {
        var maxReach = nums[0]

        for (i in 0 until nums.size - 1) {
            when {
                i > maxReach -> return false
                maxReach >= nums.size - 1 -> return true
                else -> {
                    maxReach = maxOf(maxReach, i + nums[i])
                }
            }
        }

        return maxReach >= nums.size - 1
    }
}