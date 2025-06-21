package Prep.easy.Arrays

class Solution48 {

    fun rotate(matrix: Array<IntArray>): Unit {
        val m = matrix.size
        val n = matrix[0].size

        for (i in 0 until m) {
            for (j in i until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }

        for (i in 0 until m) {
            matrix[i].reverse()
        }
    }
}