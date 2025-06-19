package Algorithms.BinarySearch

import Algorithms.BinarySearch.Fundamentals.Solution240

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 4, 7, 11, 15),
        intArrayOf(2, 5, 8, 12, 19),
        intArrayOf(3, 6, 9, 16, 22),
        intArrayOf(10, 13, 14, 17, 24),
        intArrayOf(18, 21, 23, 26, 30)
    )

    println(Solution240().searchMatrix(matrix, 20))
}