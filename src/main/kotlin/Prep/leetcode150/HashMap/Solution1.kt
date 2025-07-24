package Prep.leetcode150.HashMap

class Solution1 {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val complement = target - num
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, index)
            } else {
                map[num] = index
            }
        }

        return intArrayOf(-1, -1)
    }
}