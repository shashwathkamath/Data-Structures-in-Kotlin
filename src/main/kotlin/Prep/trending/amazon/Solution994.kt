package Prep.trending.amazon

class Solution994 {

    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size

        val rottenQueue = ArrayDeque<Pair<Int, Int>>()
        var freshCount = 0

        for (row in 0 until rows) {
            for (col in 0 until cols) {
                when (grid[row][col]) {
                    1 -> freshCount++
                    2 -> rottenQueue.add(Pair(row, col))
                }
            }
        }
        if (freshCount == 0) return 0
        val directions = arrayOf<Pair<Int, Int>>(
            Pair(1, 0),
            Pair(-1, 0),
            Pair(0, 1),
            Pair(0, -1)
        )
        var mins = 0

        while (rottenQueue.isNotEmpty() && freshCount > 0) {
            val currentSize = rottenQueue.size
            repeat(currentSize) {
                val (row, col) = rottenQueue.removeFirst()
                for (dir in directions) {
                    val newRow = row + dir.first
                    val newCol = col + dir.second
                    if (newRow in 0 until rows
                        && newCol in 0 until cols
                        && grid[newRow][newCol] == 1
                    ) {
                        grid[newRow][newCol] = 2
                        freshCount--
                        rottenQueue.add(Pair(newRow, newCol))
                    }
                }
            }
            mins++
        }
        return if (freshCount == 0) mins else -1
    }

}