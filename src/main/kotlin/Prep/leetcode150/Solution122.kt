package Prep.leetcode150

class Solution122 {

    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var profit = 0

        for (i in 1 until prices.size) {
            profit = maxOf(0, prices[i] - prices[i - 1])
            maxProfit += profit
        }

        return maxProfit
    }
}