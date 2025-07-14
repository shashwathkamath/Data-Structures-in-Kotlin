package Prep.leetcode150.ArrayStrings

class Solution33 {

    fun romanToInt(s: String): Int {
        val map = mutableMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var res = 0

        for (i in s.indices) {
            val current = map[s[i]]!!
            if (i < s.length - 1 && current < map[s[i + 1]]!!) {
                res -= current
            } else {
                res += current
            }
        }

        return res
    }
}