package Prep.easy

class Solution189 {

    fun rotate(nums: IntArray, k: Int): Unit {
        if (k == 0) return
        var rotateBy = k % nums.size

        nums.reverse(0, nums.size - rotateBy)
        nums.reverse(nums.size - rotateBy + 1, nums.size)
        nums.reverse()
    }
}