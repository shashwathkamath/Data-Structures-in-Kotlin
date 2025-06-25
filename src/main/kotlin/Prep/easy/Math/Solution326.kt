package Prep.easy.Math

class Solution326 {

    fun isPowerOfThree(n: Int): Boolean {
        if (n == 0 || n < 0) return false
        if (n == 1) return true
        return if (n % 3 == 0) isPowerOfThree(n / 3) else false
    }
}