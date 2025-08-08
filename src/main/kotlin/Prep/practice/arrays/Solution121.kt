package Prep.practice.arrays

class Solution121 {

    fun maxProfit(prices: IntArray): Int {
        var minSoFar = Int.MAX_VALUE
        var maxProfit = 0

        prices.forEach { price ->
            minSoFar = minOf(minSoFar, price)
            maxProfit = maxOf(maxProfit, price - minSoFar)
        }

        return maxProfit
    }
}