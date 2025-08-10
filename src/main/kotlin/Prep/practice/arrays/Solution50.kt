package Prep.practice.arrays

class Solution50 {

    fun myPow(x: Double, n: Int): Double {

        var binaryForm = n
        var ans = 1.0
        var base = x
        if (n < 0) {
            base = 1 / base
            binaryForm *= -1
        }
        while (binaryForm > 0) {
            if (binaryForm % 2 == 1) {
                ans *= base
            }
            base *= base
            binaryForm /= 2
        }

        return ans
    }
}