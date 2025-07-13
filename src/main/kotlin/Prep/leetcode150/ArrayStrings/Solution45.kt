package Prep.leetcode150.ArrayStrings

class Solution45 {

    fun jump(nums: IntArray): Int {

        var jumps = 0
        var nextReach = 0
        var currentReach = 0

        for (i in 0 until nums.size - 1) {
            nextReach = maxOf(nextReach, i + nums[i])
            if (i == currentReach) {
                jumps++
                currentReach = nextReach
                if (currentReach >= nums.size - 1) break
            }
        }

        return jumps
    }
}