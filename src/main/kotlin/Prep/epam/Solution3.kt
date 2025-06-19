package Prep.epam

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var start = 0
        var maxLen = Int.MIN_VALUE
        val set = mutableSetOf<Char>()

        for (end in s.indices) {
            val rightChar = s[end]

            while (rightChar in set) {
                val leftChar = s[start]
                set.remove(leftChar)
                start++
            }

            set.add(rightChar)
            maxLen = maxOf(end - start + 1, maxLen)
        }

        return maxLen
    }
}