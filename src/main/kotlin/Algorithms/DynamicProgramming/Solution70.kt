package Algorithms.DynamicProgramming

class Solution70 {

    fun climbStairs(n: Int): Int {
        //top down
        return helper(n, mutableMapOf<Int, Int>())
    }

    private fun helper(n: Int, memo: MutableMap<Int, Int>): Int {
        if (n < 0) return 0
        if (n < 2) return n
        if (n in memo) return memo[n]!!
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo)
        return memo[n]!!
    }
}
/*
//bottom up
        val dp = IntArray(n + 1) { 0 }
        dp[0] = 0
        dp[1] = 1
        dp[2] = 2

        for (i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n]
 */