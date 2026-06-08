package Graphs.DailyChallenge

/**
 * Day 6 — Rotten Oranges (Minimum Time to Rot All Oranges) (TUF Striver Graph Series · BFS/DFS)
 * Difficulty: Medium  |  LeetCode 994 (Rotting Oranges)
 *
 * Problem:
 * You are given an `m x n` grid where each cell can have one of three values:
 *   0 — representing an empty cell
 *   1 — representing a fresh orange
 *   2 — representing a rotten orange
 *
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes
 * rotten. Return the minimum number of minutes that must elapse until no cell has a fresh
 * orange. If this is impossible, return -1.
 *
 * Example 1:
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 *
 * Example 2:
 * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation: The orange in the bottom-left corner (row 2, column 0) is never rotten,
 * because rotting only happens 4-directionally.
 *
 * Example 3:
 * Input: grid = [[0,2]]
 * Output: 0
 * Explanation: There are no fresh oranges at minute 0, so the answer is just 0.
 *
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 10
 * grid[i][j] is 0, 1, or 2
 *
 * Hint: Multi-source BFS — push every initially rotten orange into the queue at once and
 * expand level by level (minute by minute), tracking the count of fresh oranges remaining.
 */
class Day06_RottenOrangesMinimumTimeToRotAllOranges {

    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue = ArrayDeque<Pair<Int, Int>>()
        var res = 0
        grid.forEachIndexed { i, row ->
            row.forEachIndexed { j, cell ->
                if (cell == 2) queue.add(i to j)
            }
        }
        fun isIndexInRange(i: Int, j: Int): Boolean = (i >= 0 && i < grid.size && j >= 0 && j < grid[0].size)
        while (queue.isNotEmpty()) {
            var rotted = false
            repeat(queue.size) {
                val (i, j) = queue.removeFirst()
                listOf(i + 1 to j, i - 1 to j, i to j + 1, i to j - 1).forEach { (ni, nj) ->
                    if (isIndexInRange(ni, nj) && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2
                        rotted = true
                        queue.add(ni to nj)
                    }
                }
            }
            if (rotted) res++
        }

        val hasFreshOranges = grid.any { row -> row.any { cell -> cell == 1 } }
        return if (hasFreshOranges) -1 else res
    }

}

fun main() {
    val grid = arrayOf(
        intArrayOf(2, 1, 1),
        intArrayOf(1, 1, 0),
        intArrayOf(0, 1, 1)
    )

    val result = Day06_RottenOrangesMinimumTimeToRotAllOranges().orangesRotting(grid)
    println("Minutes until no fresh orange remains: $result") // Expected: 4
}
