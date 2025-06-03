package Algorithms.BinarySearch.Practice

class Solution1891 {

    fun maxLength(ribbons: IntArray, k: Int): Int {
        var low = 1
        var high = ribbons.maxOrNull() ?: 0
        var ans = 0
        while (low <= high) {
            val mid = low + (high - low) / 2
            var peices = 0

            for (ribbon in ribbons) {
                peices += ribbon / mid
            }

            if (peices >= k) {
                ans = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return ans
    }
}