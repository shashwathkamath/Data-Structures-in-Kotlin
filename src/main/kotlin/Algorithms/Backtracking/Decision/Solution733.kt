package Algorithms.Backtracking.Decision

class Solution733 {

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val orignalColor = image[sr][sc]
        if (orignalColor == color) return image

        val rows = image.size
        val cols = image[0].size

        val directions = listOf<Pair<Int, Int>>(
            Pair(1, 0),//down
            Pair(-1, 0),//up
            Pair(0, 1),//right
            Pair(0, -1),//left
        )

        fun isSafe(row: Int, col: Int): Boolean {
            return row in 0 until rows &&
                    col in 0 until cols &&
                    image[row][col] == orignalColor
        }

        fun backtrack(row: Int, col: Int) {
            image[row][col] = color

            for ((dr, dc) in directions) {
                val newRow = row + dr
                val newCol = col + dc

                if (isSafe(newRow, newCol)) {
                    backtrack(newRow, newCol)
                }
            }
        }
        backtrack(sr, sc)
        return image
    }
}