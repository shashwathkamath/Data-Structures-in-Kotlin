package Prep.trending

import kotlin.math.abs

class Solution1438 {

    fun longestSubarray(nums: IntArray, limit: Int): Int {
        var left = 0
        var maxLen = 0

        for (right in nums.indices) {
            val diff = abs(nums[right] - nums[left])
            while (diff <= limit) {
                maxLen = maxOf(maxLen, right - left + 1)
            }
        }

        return maxLen
    }
}