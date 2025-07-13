package Prep.leetcode150.ArrayStrings

class Solution80 {

    fun removeDuplicates(nums: IntArray): Int {
        var lastIndex = 2

        for (i in 2 until nums.size) {
            if (nums[i] != nums[i - 2]) {
                nums[lastIndex] = nums[i - 2]
                lastIndex++
            }
        }

        return lastIndex
    }
}