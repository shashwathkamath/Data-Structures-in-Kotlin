package Algorithms.BinarySearch.Fundamentals

class Solution74 {

    fun binarySearch2D(matrix: Array<IntArray>, target: Int): Boolean {

        val m = matrix.size
        val n = matrix[0].size

        var low = 0
        var high = m * n - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            val midElement = matrix[mid / n][mid % n]
            when {
                midElement == target -> {
                    return true
                }

                midElement > target -> {
                    high = mid - 1
                }

                else -> {
                    low = mid + 1
                }
            }
        }
        return false
    }
}