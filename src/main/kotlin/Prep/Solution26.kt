package Prep

class Solution26 {

    fun removeDuplicates(nums: IntArray): Int {
        var lastIndex = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[lastIndex - 1]) {
                nums[lastIndex++] = nums[i]
            }
        }

        return lastIndex
    }
}