package Algorithms.Backtracking.Decision

class Solution79 {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val m = board.size
        val n = board[0].size
        val visited = Array(m) { BooleanArray(n) }

        fun isSafe(row: Int, col: Int): Boolean {
            return row in 0 until m &&
                    col in 0 until n &&
                    !visited[row][col]
        }

        val directions = listOf<Pair<Int, Int>>(
            Pair(1, 0),
            Pair(-1, 0),
            Pair(0, 1),
            Pair(0, -1),
        )

        fun backtrack(row: Int, col: Int, index: Int): Boolean {
            if (index == word.length) return true
            if (!isSafe(row, col) || board[row][col] != word[index]) return false

            visited[row][col] = true
            for ((dr, dc) in directions) {
                val newRow = row + dr
                val newCol = col + dc
                if (backtrack(newRow, newCol, index + 1)) return true
            }
            visited[row][col] = false
            return false
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (board[i][j] == word[0]) {
                    if (backtrack(i, j, 0)) return true
                }
            }
        }
        return false
    }
}