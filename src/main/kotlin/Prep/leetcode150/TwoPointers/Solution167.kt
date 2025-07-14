package Prep.leetcode150.TwoPointers

class Solution167 {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1

        while (i < j) {
            val sum = numbers[i] + numbers[j]
            if (sum == target) {
                return intArrayOf(i + 1, j + 1)
            } else if (sum < target) {
                i++
            } else {
                j--
            }
        }

        return intArrayOf(-1, -1)
    }
}