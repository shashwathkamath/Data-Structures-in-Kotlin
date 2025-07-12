package Prep.leetcode150

class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        var minSofar = Int.MAX_VALUE
        var maxProfit = 0

        for (i in prices.indices) {
            minSofar = minOf(minSofar, prices[i])
            maxProfit = maxOf(maxProfit, prices[i] - minSofar)
        }

        return maxProfit
    }
}