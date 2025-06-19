package Prep.epam

class Solution48 {

    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size

        //transpose
        for (i in 0 until n) {
            for (j in 0 until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        //reverse each row
        for (i in 0 until n) {
            for (j in 0 until n / 2) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[i][n - 1 - j]
                matrix[i][n - 1 - j] = temp
            }
        }
    }
}