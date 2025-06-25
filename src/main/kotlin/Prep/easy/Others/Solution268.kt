package Prep.easy.Others

class Solution268 {

    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val expectedSum = n * (n + 1) / 2
        val actualSum = nums.sum()
        return expectedSum - actualSum
    }
}