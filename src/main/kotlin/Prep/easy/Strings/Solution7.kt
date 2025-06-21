package Prep.easy.Strings

class Solution7 {

    fun reverse(x: Int): Int {
        if (x <= 9 || x >= -9) return x

        var isNegative = false
        var num = x

        if (x < 0) {
            isNegative = true
            num *= -1
        }
        var reversedNum = 0

        while (num > 0) {

            val digit = num % 10
            if (reversedNum > Int.MAX_VALUE / 10) return 0
            reversedNum = reversedNum * 10 + digit
            num = num / 10
        }
        if (reversedNum > Int.MAX_VALUE || reversedNum < Int.MIN_VALUE) return 0
        if (isNegative) reversedNum *= -1

        return reversedNum
    }
}