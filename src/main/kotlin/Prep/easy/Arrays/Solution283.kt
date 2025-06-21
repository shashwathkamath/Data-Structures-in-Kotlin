package Prep.easy.Arrays

class Solution283 {

    fun moveZeroes(nums: IntArray): Unit {
        var i = 0
        for (j in 0 until nums.size) {
            if (nums[j] != 0) {
                nums[i++] = nums[j]
            }
        }

        while (i < nums.size) {
            nums[i++] = 0
        }
    }
}