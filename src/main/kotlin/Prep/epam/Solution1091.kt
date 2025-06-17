package Prep.epam

class Solution1091 {

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val n = grid.size

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1 || n == 0) return -1
        val directions = listOf<Pair<Int, Int>>(
            Pair(-1, 0),
            Pair(1, 0),
            Pair(0, -1),
            Pair(0, 1),
            Pair(-1, -1),
            Pair(-1, 1),
            Pair(1, -1),
            Pair(1, 1)
        )
        val queue = ArrayDeque<Triple<Int, Int, Int>>()
        queue.addLast(Triple(0, 0, 1))
        grid[0][0] = 1

        while (queue.isNotEmpty()) {
            val (y, x, dist) = queue.removeFirst()
            if (y == n - 1 && x == n - 1) return dist
            for (dir in directions) {
                val nY = dir.first + y
                val nX = dir.second + x

                if (nY >= 0 && nY < n && nX >= 0 && nX < n && grid[nY][nX] == 0) {
                    queue.add(Triple(nY, nX, dist + 1))
                    grid[nY][nX] = 1
                }
            }
        }
        return -1
    }
}