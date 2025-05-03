package Algorithms.Recurssion

class Solution1005 {
    fun recursivelyFindTheNthFibonacciNumber(n: Int): Long {
        if (n < 0) throw IllegalArgumentException("Negative number is not expected")
        return when {
            n == 0 -> 0L
            n == 1 -> 1L
            else -> recursivelyFindTheNthFibonacciNumber(n - 1) + recursivelyFindTheNthFibonacciNumber(n - 2)
        }
    }
}