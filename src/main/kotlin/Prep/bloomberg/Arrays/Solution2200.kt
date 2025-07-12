package Prep.bloomberg.Arrays

import kotlin.math.abs

class Solution2200 {

    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        //find the occurence of key in nums
        val set = mutableSetOf<Int>()
        nums.forEachIndexed { i, num ->
            if (num == key) {
                set.add(i)
            }
        }
        val res = mutableListOf<Int>()

        for (i in 0 until nums.size) {
            for (j in set) {
                if (abs(i - j) <= k) {
                    res.add(i)
                    break
                }
            }
        }

        return res
    }
}