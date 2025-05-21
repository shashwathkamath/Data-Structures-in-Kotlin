package Algorithms.Backtracking

import Algorithms.Backtracking.Decision.Solution001


fun main() {

    val maze = arrayOf(
        intArrayOf(1, 0, 0, 0),
        intArrayOf(1, 1, 0, 1),
        intArrayOf(1, 1, 0, 0),
        intArrayOf(0, 1, 1, 1)
    )

    val solver = Solution001()
    val paths = solver.findPaths(maze)
    println(paths)
}