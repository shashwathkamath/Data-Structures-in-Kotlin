package Prep.leetcode150

class Solution189 {

    fun rotate(nums: IntArray, k: Int): Unit {
        val rotateBy = k % nums.size
        nums.reverse(0, nums.size - rotateBy)
        nums.reverse(nums.size - rotateBy, nums.size)
        nums.reverse(0, nums.size)
    }
}