package Prep.epam

class Solution13 {

    /*
    Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
     */
    fun romanToInt(s: String): Int {
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
            val currentValue = map[s[i]]!!
            if (i < s.length - 1 && currentValue < map[s[i + 1]]!!) {
                result -= currentValue
            } else {
                result += currentValue
            }
        }

        return result
    }
}