package Prep.leetcode150.HashMap

class Solution128 {

    fun longestConsecutive(nums: IntArray): Int {
        val numsSet = nums.toSet()
        var maxLen = 0

        nums.forEach { num ->
            if (!numsSet.contains(num - 1)) {
                var currNum = num
                var currentLen = 1

                while (numsSet.contains(currNum + 1)) {
                    currentLen++
                    currNum = currNum + 1
                }
                maxLen = maxOf(maxLen, currentLen)
            }
        }
        return maxLen
    }
}