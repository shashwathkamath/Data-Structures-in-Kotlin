package Prep.leetcode150.HashMap

class Solution219 {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, num ->
            if (map.contains(num) && i - map[num]!! <= k) return true
            else {
                map[num] = i
            }
        }

        return false
    }
}