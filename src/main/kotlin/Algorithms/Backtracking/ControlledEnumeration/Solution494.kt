package Algorithms.Backtracking.ControlledEnumeration

class Solution494 {

    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        var count = 0

        fun backtrack(index: Int, sum: Int) {
            if (index == nums.size) {
                if (sum == target) {
                    count++
                }
                return
            }
            backtrack(index + 1, sum + nums[index])
            backtrack(index + 1, sum - nums[index])
        }
        backtrack(0, 0)
        return count
    }
}