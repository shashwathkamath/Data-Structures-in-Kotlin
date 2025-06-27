package Algorithms.DynamicProgramming

class Solution198 {

    fun rob(nums: IntArray): Int {
        if (nums.size < 2) return -1
        val dp = IntArray(nums.size) { 0 }
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])

        for (i in 2 until nums.size) {
            dp[i] = maxOf(dp[i - 1], nums[i] + dp[i - 2])
        }

        return dp[dp.size - 1]
    }
}