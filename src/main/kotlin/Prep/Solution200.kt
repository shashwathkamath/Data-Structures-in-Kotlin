package Prep

class Solution200 {

    private var count = 0

    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0
        val m = grid.size
        val n = grid[0].size

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == '1') {
                    helper(grid, i, j)
                    count++
                }
            }
        }
        return count
    }

    private fun helper(grid: Array<CharArray>, i: Int, j: Int) {
        if (i < grid.size && i >= 0 && j < grid[0].size && j >= 0 && grid[i][j] == '1') {
            grid[i][j] = '2'
            helper(grid, i + 1, j)
            helper(grid, i - 1, j)
            helper(grid, i, j + 1)
            helper(grid, i, j - 1)

            grid[i][j] = '1'
        }
    }
}