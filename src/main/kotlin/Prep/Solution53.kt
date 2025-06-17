package Prep

class Solution53 {

    fun maxSubArray(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var currSum = 0

        for (num in nums) {
            currSum = maxOf(currSum + num, num)
            maxSum = maxOf(currSum, maxSum)
        }

        return maxSum
    }
}