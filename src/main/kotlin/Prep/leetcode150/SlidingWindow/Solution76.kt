package Prep.leetcode150.SlidingWindow

class Solution76 {

    fun minWindow(s: String, t: String): String {
        if (t.length > s.length) return ""
        var left = 0
        val map = mutableMapOf<Char, Int>()

        t.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        var count = 0
        var minLeft = 0
        var minLen = Int.MAX_VALUE

        for (right in s.indices) {
            val rightChar = s[right]
            if (map.containsKey(rightChar)) {
                map[rightChar] = map[rightChar]!! - 1
                if (map[rightChar]!! >= 0) {
                    count++
                }
            }
            while (count == t.length) {
                if (minLen > right - left + 1) {
                    minLen = right - left + 1
                    minLeft = left
                }
                val leftChar = s[left]
                if (map.containsKey(leftChar)) {
                    map[leftChar] = map[leftChar]!! + 1
                    if (map[leftChar]!! > 0) {
                        count--
                    }
                }
                left++
            }
        }

        return if (minLen == Int.MAX_VALUE) "" else s.substring(minLeft, minLeft + minLen)
    }
}