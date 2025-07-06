package Prep.Bloomberg.Others

class Solution7 {

    fun reverse(x: Int): Int {
        var isNegative = false
        var currNum = x
        if (x < 0) {
            isNegative = true
            currNum = currNum * -1
        }
        var reversedNumber = 0
        while (currNum > 0) {
            val unit = currNum % 10
            if (reversedNumber > Int.MAX_VALUE / 10) return 0
            reversedNumber = reversedNumber * 10 + unit
            currNum = currNum / 10
        }
        if (x >= Int.MAX_VALUE || x <= Int.MIN_VALUE) return 0
        return if (isNegative) reversedNumber * -1 else reversedNumber
    }
}