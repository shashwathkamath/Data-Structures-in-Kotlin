package Prep.medium.Arrays

class Solution334 {

    fun increasingTriplet(nums: IntArray): Boolean {
        var firstNum = Int.MAX_VALUE
        var secondNum = Int.MAX_VALUE

        for (num in nums) {
            when {
                num <= firstNum -> firstNum = num
                num <= secondNum -> secondNum = num
                else -> return true
            }
        }

        return false
    }
}