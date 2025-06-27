package Algorithms.DynamicProgramming

class SolutionFactorial {

    fun calculateFactorialBottomUp(n: Int): Int {
        //f(n) = n * n-1!
        if (n < 0) return n
        val dp = IntArray(n + 1) { 1 }

        for (i in 1..n) {
            dp[i] = i * dp[i - 1]
        }

        return dp[n]
    }

    fun calculateFactorialTopDown(n: Int): Int {
        val memo = mutableMapOf<Int, Int>()
        return helper(n, memo)
    }

    private fun helper(n: Int, memo: MutableMap<Int, Int>): Int {
        if (n < 0) return 0
        if (n == 0) return 1
        if (n in memo) return memo[n]!!
        memo[n] = n * memo[n - 1]!!
        return memo[n]!!
    }
}