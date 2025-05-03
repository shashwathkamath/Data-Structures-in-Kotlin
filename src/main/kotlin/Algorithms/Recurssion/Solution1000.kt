package Algorithms.Recurssion

class Solution1000 {

    fun calculateFactorial(n: Int): Int {
        if (n == 0) return 1
        return n * calculateFactorial(n - 1)
    }
}