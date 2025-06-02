package Algorithms.BinarySearch.Practice

class Solution441 {

    fun arrangeCoins(n: Int): Int {
        var low = 1
        var high = n
        var ans = 0

        while (low <= high) {
            val mid = low + (high - low) / 2
            val x = 1L * mid * (mid + 1) / 2
            when {
                x == n.toLong() -> return mid
                x > n -> high = mid - 1
                else -> {
                    ans = mid
                    low = mid + 1
                }
            }
        }

        return ans
    }
}