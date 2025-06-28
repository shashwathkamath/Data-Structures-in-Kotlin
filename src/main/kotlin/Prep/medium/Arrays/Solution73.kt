package Prep.medium.Arrays

class Solution73 {

    fun setZeroes(matrix: Array<IntArray>): Unit {
        val m = matrix.size
        val n = matrix[0].size
        //mark the row and col
        var fr: Boolean = false
        var fc: Boolean = false

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == 0) {
                    if (i == 0) fr = true
                    if (j == 0) fc = true
                    matrix[0][j] = 0
                    matrix[i][0] = 0
                }
            }
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0
                }
            }
        }

        if (fr) {
            for (j in 0 until n) {
                matrix[0][j] = 0
            }
        }
        if (fc) {
            for (i in 0 until m) {
                matrix[i][0] = 0
            }
        }
    }


}