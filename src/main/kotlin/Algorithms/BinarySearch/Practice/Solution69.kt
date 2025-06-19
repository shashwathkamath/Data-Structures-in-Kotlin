package Algorithms.BinarySearch.Practice

class Solution69 {

    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        var low = 1
        var high = x / 2
        var ans = 0

        while (low <= high) {
            val mid = low + (high - low) / 2
            val square = mid.toLong() * mid
            when {
                square == x.toLong() -> return mid
                square > x -> high = mid - 1
                else -> {
                    ans = mid
                    low = mid + 1
                }
            }
        }

        return ans
    }
}