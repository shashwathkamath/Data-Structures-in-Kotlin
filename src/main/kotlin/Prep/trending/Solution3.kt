package Prep.trending

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        var maxLen = 0
        val set = mutableSetOf<Char>()
        var left = 0

        for (right in 0 until s.length) {
            val rightChar = s[right]

            while (rightChar in set) {
                val leftChar = s[left]
                set.remove(leftChar)
                left++
            }
            set.add(rightChar)
            maxLen = maxOf(right - left + 1, maxLen)
        }

        return maxLen
    }
}