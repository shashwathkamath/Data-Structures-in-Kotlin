package Prep

import kotlin.math.abs

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val res = IntArray(2) { -1 }
        for ((index, num) in nums.withIndex()) {
            val complement = abs(target - num)
            if (map.contains(complement)) {
                res[0] = map[complement]!!
                res[1] = index
                break
            } else {
                map[num] = index
            }
        }
        print("${res[0]},${res[1]}")
        return res
    }
}
/**
 *  fun twoSum(nums: IntArray, target: Int): IntArray {
 *         var low = 0
 *         var high = nums.size - 1
 *         val res = IntArray(2) { -1 }
 *         while (low < high) {
 *             when {
 *                 nums[low] + nums[high] > target -> {
 *                     high--
 *                 }
 *
 *                 nums[low] + nums[high] < target -> {
 *                     low++
 *                 }
 *
 *                 else -> {
 *                     res[0] = low
 *                     res[1] = high
 *                     print("result $low , $high")
 *                     break
 *                 }
 *             }
 *         }
 *
 *         return res
 *     }
 */