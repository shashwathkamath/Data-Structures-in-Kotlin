package Algorithms.Backtracking.Decision

class Solution79 {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val m = board.size
        val n = board[0].size

        if (n == 0) return false

        val directions = listOf<Pair<Int, Int>>(
            Pair(-1, 0), //up
            Pair(1, 0),//down
            Pair(0, -1),//left
            Pair(0, 1)//right
        )

        val visited = Array(m) { BooleanArray(n) }
        var result = false
        val coordinates = mutableListOf<Pair<Int, Int>>()

        fun findCoordinatesOfWord(c: Char) {
            for (i in 0 until m) {
                for (j in 0 until n) {
                    if (board[i][j] == c) {
                        coordinates.add(Pair(i, j))
                    }
                }
            }
        }
        findCoordinatesOfWord(word[0])

        fun isSafe(row: Int, col: Int): Boolean {
            return row in 0 until m &&
                    col in 0 until n &&
                    !visited[row][col]
        }


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

        coordinates.forEach { coordinate ->
            if (backtrack(coordinate.first, coordinate.second, 0)) return true
        }
        return false
    }
}