package Prep.leetcode150.SlidingWindow

class Solution209 {

    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        var min = Int.MAX_VALUE
        var sum = 0

        for (right in nums.indices) {
            sum += nums[right]
            while (sum >= target) {
                min = minOf(min, right - left + 1)
                sum -= nums[left]
                left++
            }
        }

        return if (min == Int.MAX_VALUE) 0 else min
    }
}