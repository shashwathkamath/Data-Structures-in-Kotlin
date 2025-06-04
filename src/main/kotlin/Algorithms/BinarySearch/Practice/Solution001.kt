package Algorithms.BinarySearch.Practice

class Solution001 {

    fun findCommonElement(matrix: Array<IntArray>): Int {
        val m = matrix.size
        var foundInAll = true

        for (num in matrix[0]) {
            for (i in 1 until m) {
                if (!binarySearch(matrix[i], num)) {
                    foundInAll = false
                    break
                }
            }
            if (foundInAll) return num
        }
        return -1
    }

    private fun binarySearch(row: IntArray, target: Int): Boolean {
        var left = 0
        var right = row.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                row[mid] == target -> return true
                row[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return false
    }
}