package Algorithms.BinarySearch.Practice

class Solution367 {

    fun isPerfectSquare(num: Int): Boolean {
        if (num < 2) return true
        var low = 1
        var high = num / 2

        while (low <= high) {
            val mid = low + (high - low) / 2
            val sq = mid.toLong() * mid
            when {
                sq == num.toLong() -> {
                    return true
                }

                sq > num -> high = mid - 1
                else -> low = mid + 1
            }
        }

        return false
    }
}