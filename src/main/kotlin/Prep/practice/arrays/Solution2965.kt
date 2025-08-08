package Prep.practice.arrays

import kotlin.math.abs

class Solution2965 {

    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val n = grid.size
        val set = mutableSetOf<Int>()

        val res = IntArray(2)
        var sum = 0
        grid.forEach { eachArr ->
            eachArr.forEach { num ->
                sum += num
                if (num in set) {
                    res[0] = num
                }
                set.add(num)
            }
        }

        val expectedSum = (n * n) * (n * n + 1) / 2
        res[1] = abs(expectedSum + res[0] - sum)

        return res
    }
}