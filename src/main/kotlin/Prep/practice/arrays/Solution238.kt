package Prep.practice.arrays

class Solution238 {

    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n) { 1 }

        for (i in 1 until n) {
            ans[i] = ans[i - 1] * nums[i - 1]
        }
        var suffix = 1

        for (i in n - 2 downTo 0) {
            suffix *= nums[i + 1]
            ans[i] *= suffix
        }

        return ans
    }
}