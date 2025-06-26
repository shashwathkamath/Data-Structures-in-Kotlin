package Prep.trending

class Solution200 {


    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
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
        if (i > grid.size - 1 || i < 0 || j > grid[0].size - 1 || j < 0 || grid[i][j] != '1') return
        grid[i][j] = '2'
        helper(grid, i + 1, j)
        helper(grid, i - 1, j)
        helper(grid, i, j + 1)
        helper(grid, i, j - 1)
    }
}