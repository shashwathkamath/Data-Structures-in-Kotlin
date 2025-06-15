package Prep

class Solution50 {

    fun myPow(x: Double, n: Int): Double {
        if (n == Int.MIN_VALUE) return if (x == 1.0 || x == -1.0) 1.0 else 0.0
        var result = 1.0
        var absN = if (n < 0) -n else n
        var base = if (n < 0) 1.0 / x else x
        while (absN > 0) {
            if (absN % 2 == 1) result *= base
            base *= base
            absN /= 2
        }

        return result
    }
}