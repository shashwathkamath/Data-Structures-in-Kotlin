package Prep.bloomberg.Arrays

class Solution594 {

    fun findLHS(nums: IntArray): Int {
        val freq = mutableMapOf<Int, Int>()
        var maxLen = 0

        for (num in nums) {
            freq[num] = freq.getOrDefault(num, 0) + 1
        }

        for (key in freq.keys) {
            if (freq.contains(key + 1)) {
                maxLen = maxOf(maxLen, freq[key]!! + freq[key + 1]!!)
            }
        }

        return maxLen
    }
}