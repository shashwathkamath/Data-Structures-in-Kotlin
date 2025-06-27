package Algorithms.DynamicProgramming

class SolutionFibonacci {

    fun calculateFibonacciBottomUp(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1
        val dp = IntArray(n + 1) { 0 }
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[n]
    }

    fun calculateFibonacciTopDown(n: Int): Int {
        return helper(n, mutableMapOf<Int, Int>())
    }

    private fun helper(n: Int, memo: MutableMap<Int, Int>): Int {
        if (n < 0) return 0
        if (n == 0) return 0
        if (n == 1) return 1
        if (n in memo) return memo[n]!!
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo)
        return memo[n]!!
    }

}