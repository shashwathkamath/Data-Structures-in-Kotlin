package Prep.easy.Strings

class Solution8 {

    fun myAtoi(s: String): Int {
        val filteredString = s.replace(" ", "")
        var isNegative = false
        var isOutOfRange = false

        if (filteredString[0] == '-') {
            isNegative = true
        }

        var total = 0
        var i = 0

        while (i < filteredString.length && filteredString[i].isLetterOrDigit()) {
            val num = s[i] - '0'
            if (total > Int.MAX_VALUE / 10 || (-1 * total) < Int.MIN_VALUE / 10) {
                isOutOfRange = true
                break
            }
            total = total * 10 + num
            i++
        }

        return when {
            isOutOfRange && isNegative -> Int.MIN_VALUE
            isOutOfRange && !isNegative -> Int.MAX_VALUE
            isNegative -> total * -1
            else -> total
        }
    }
}