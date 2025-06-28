package Prep.medium.Arrays

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var maxLen = 0
        val set = mutableSetOf<Char>()

        for (right in s.indices) {
            val rightChar = s[right]

            while (set.contains(rightChar)) {
                val leftChar = s[left]
                set.remove(leftChar)
                left++
            }

            set.add(rightChar)
            maxLen = maxOf(maxLen, right - left + 1)
        }

        return maxLen
    }
}