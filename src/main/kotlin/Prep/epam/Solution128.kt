package Prep.epam

class Solution128 {

    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toSet()
        var maxLen = 0

        nums.forEach { num ->
            if (!numSet.contains(num - 1)) {
                var currentNum = num
                var currentLength = 1
                while (numSet.contains(currentNum + 1)) {
                    currentLength++
                    currentNum++
                }
                maxLen = maxOf(currentLength, maxLen)
            }
        }

        return maxLen
    }
}