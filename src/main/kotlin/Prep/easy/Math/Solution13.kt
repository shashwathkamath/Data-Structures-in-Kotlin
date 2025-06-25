package Prep.easy.Math

class Solution13 {

    fun romanToInt(s: String): Int {
        if (s.isEmpty()) return 0
        val map = mapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var result = 0

        for (i in s.indices) {
            val currentNumber = map[s[i]]!!
            if (i < s.length - 1 && currentNumber < map[s[i + 1]]!!) {
                result -= currentNumber
            } else {
                result += currentNumber
            }
        }

        return result
    }
}