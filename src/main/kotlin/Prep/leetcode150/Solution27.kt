package Prep.leetcode150

class Solution27 {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var lastIndex = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[lastIndex] = nums[i]
                lastIndex++
            }
        }

        return lastIndex
    }
}