package Graphs.DailyChallenge

/**
 * Day 4 — Number of Islands (TUF Striver Graph Series · BFS/DFS)
 * Difficulty: Medium  |  LeetCode 200
 *
 * Problem:
 * Given an `m x n` 2D binary grid `grid` which represents a map of '1's (land) and '0's (water),
 * return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 * vertically. You may assume all four edges of the grid are surrounded by water.
 *
 * Example 1:
 * Input:
 * grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 *
 * Example 2:
 * Input:
 * grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 *
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'
 *
 * Hint: Treat each '1' cell as a graph node connected to its up/down/left/right neighbours that
 * are also '1'. Run BFS or DFS from every unvisited land cell, marking the whole connected
 * component as visited — each traversal you start counts as one island.
 */
class Day04_NumberOfIslands {

    fun numIslands(grid: Array<CharArray>): Int {
        val r = grid.size
        val c = grid[0].size
        var res = 0

        fun helper(i: Int, j: Int) {
            if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] != '1') {
                return
            }
            grid[i][j] = '0'
            helper(i + 1, j)
            helper(i - 1, j)
            helper(i, j + 1)
            helper(i, j - 1)
        }

        for (i in 0 until r) {
            for (j in 0 until c) {
                if (grid[i][j] == '1') {
                    helper(i, j)
                    res++
                }
            }
        }

        return res
    }

}

fun main() {
    val grid = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1')
    )

    val result = Day04_NumberOfIslands().numIslands(grid)
    println("Number of islands: $result") // Expected: 3
}
