package Prep.bloomberg.Trees

class Solution200 {
    private var count = 0

    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0

        for (i in 0 until grid.size) {
            for (j in 0 until grid[0].size) {
                if (grid[i][j] == '1') {
                    helper(grid, i, j)
                    count++
                }
            }
        }

        return count
    }

    private fun helper(grid: Array<CharArray>, i: Int, j: Int) {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] != '1') {
            return
        }
        grid[i][j] = '2'
        helper(grid, i + 1, j)
        helper(grid, i - 1, j)
        helper(grid, i, j + 1)
        helper(grid, i, j - 1)
    }
}