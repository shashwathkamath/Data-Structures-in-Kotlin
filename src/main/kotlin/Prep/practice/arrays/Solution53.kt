package Prep.practice.arrays

class Solution53 {

    fun maxSubArray(nums: IntArray): Int {
        var currSum = 0
        var maxSum = Int.MIN_VALUE

        nums.forEach { num ->
            currSum += num
            maxSum = maxOf(currSum, maxSum)
            if (currSum < 0) {
                currSum = 0
            }
        }

        return maxSum
    }
}