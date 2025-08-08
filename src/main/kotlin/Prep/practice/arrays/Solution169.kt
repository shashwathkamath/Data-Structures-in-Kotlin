package Prep.practice.arrays

class Solution169 {

    fun majorityElement(nums: IntArray): Int {
        var ans = 0
        var freq = 0

        nums.forEach {
            if (freq == 0) ans = it
            if (it == ans) {
                freq++
            } else {
                freq--
            }
        }

        return ans
    }
}