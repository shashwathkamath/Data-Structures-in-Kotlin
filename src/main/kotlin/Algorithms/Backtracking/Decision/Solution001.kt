package Algorithms.Backtracking.Decision

class Solution001 {

    fun findPaths(maze: Array<IntArray>): List<String> {
        val res = mutableListOf<String>()
        val n = maze.size
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) return res
        val visited = Array(n) { BooleanArray(n) }
        val directions = listOf<Triple<Int, Int, Char>>(
            Triple(1, 0, 'D'),
            Triple(-1, 0, 'U'),
            Triple(0, -1, 'L'),
            Triple(0, 1, 'R')
        )

        fun isSafe(row: Int, col: Int): Boolean {
            return row in 0 until n &&
                    col in 0 until n &&
                    maze[row][col] == 1 &&
                    !visited[row][col]
        }

        fun backtrack(row: Int, col: Int, path: StringBuilder) {
            if (row == n - 1 && col == n - 1) {
                res.add(path.toString())
                return
            }
            visited[row][col] = true
            for ((dr, dc, moveChar) in directions) {
                val newRow = row + dr
                val newCol = col + dc

                if (isSafe(newRow, newCol)) {
                    path.append(moveChar)
                    backtrack(newRow, newCol, path)
                    path.deleteAt(path.length - 1)
                }
            }
            visited[row][col] = false
        }
        backtrack(0, 0, StringBuilder())
        return res
    }
}