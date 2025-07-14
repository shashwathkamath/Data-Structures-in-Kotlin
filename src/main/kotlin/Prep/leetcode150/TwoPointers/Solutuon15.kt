package Prep.leetcode150.TwoPointers

class Solutuon15 {

    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = mutableListOf<List<Int>>()

        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var j = i + 1
            var k = nums.size - 1
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                when {
                    sum == 0 -> {
                        res.add(listOf(nums[i], nums[j], nums[k]))
                        j++
                        k--
                        while (j < k && nums[j] == nums[j - 1]) j++
                        while (j < k && nums[k] == nums[k + 1]) k--
                    }

                    sum > 0 -> {
                        k--
                    }

                    else -> {
                        j++
                    }
                }
            }
        }

        return res
    }
}