package Prep

class Solution7 {

    fun reverse(x: Int): Int {
        var isNegative = false
        var currNum = x
        if (x < 0) {
            isNegative = true
            currNum *= -1
        }

        var total = 0

        while (currNum > 0) {
            val unit = currNum % 10 //123
            total = 10 * total + unit
            currNum = currNum / 10
        }

        if (total > Int.MAX_VALUE || total < Int.MIN_VALUE) return 0

        if (isNegative) {
            total = (-1) * total
        }

        return total
    }
}