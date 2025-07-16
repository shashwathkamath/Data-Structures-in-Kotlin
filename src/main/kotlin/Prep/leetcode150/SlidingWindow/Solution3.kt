package Prep.leetcode150.SlidingWindow

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var len = Int.MIN_VALUE
        var left = 0
        val set = mutableSetOf<Char>()

        for (right in s.indices) {
            val rightChar = s[right]
            while (rightChar in set) {
                val leftChar = s[left]
                set.remove(leftChar)
                left++
            }
            set.add(rightChar)
            len = maxOf(len, right - left + 1)
        }

        return len
    }
}