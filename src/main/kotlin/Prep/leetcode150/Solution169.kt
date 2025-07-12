package Prep.leetcode150

class Solution169 {

    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        var candidate = 0

        map.forEach {
            if (it.value > nums.size / 2) {
                candidate = it.key
            }
        }

        return candidate
    }
}