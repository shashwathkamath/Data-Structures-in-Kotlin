package Algorithms.Backtracking.optimization

class Solution931 {

    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        val m = matrix.size
        val n = matrix[0].size
        var min = Int.MAX_VALUE
        val directions = listOf<Pair<Int, Int>>(
            Pair(1, 0),//down
            Pair(1, -1),//downLeft
            Pair(1, 1)//downRight
        )

        fun isSafe(row: Int, col: Int): Boolean {
            return row in 0 until m &&
                    col in 0 until n
        }

        fun backtrack(row: Int, col: Int, sum: Int) {
            if (!isSafe(row, col)) return

            val currSum = sum + matrix[row][col]
            if (row == m - 1) {
                min = minOf(currSum, min)
                return
            }
            for ((dr, dc) in directions) {
                val newRow = row + dr
                val newCol = col + dc
                backtrack(newRow, newCol, currSum)
            }
        }
        for (col in 0 until n) {
            backtrack(0, col, 0)
        }
        return min
    }
}