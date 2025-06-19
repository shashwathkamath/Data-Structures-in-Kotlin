package Algorithms.BinarySearch.Fundamentals

class Solution240 {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size
        var r = 0
        var c = n - 1

        while (r < m && c > 0) {
            when {
                matrix[r][c] == target -> return true
                matrix[r][c] < target -> r++
                else -> c--
            }
        }
        return false
    }
}