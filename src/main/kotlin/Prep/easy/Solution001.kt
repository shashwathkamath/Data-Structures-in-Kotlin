package Prep.easy

class Solution001 {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        var res = IntArray(2) { -1 }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                res[0] = i
                res[1] = map[complement]!!
            } else {
                map[nums[i]] = i
            }
        }

        return res
    }
}