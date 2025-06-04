package Algorithms.BinarySearch.Practice

class Solution633 {

    fun judgeSquareSum(c: Int): Boolean {
        var left = 0
        var right = sqrtCustom(c)
        while (left <= right) {
            val pythValue = left.toLong() * left + right.toLong() * right
            when {
                pythValue == c.toLong() -> return true
                pythValue > c -> right--
                else -> left++
            }
        }
        return false
    }

    private fun sqrtCustom(c: Int): Int {
        if (c < 2) return c
        var left = 1
        var right = c / 2
        var ans = 0

        while (left <= right) {
            val mid = left + (right - left) / 2
            val square = mid.toLong() * mid
            when {
                square == c.toLong() -> return mid
                square > c -> right = mid - 1
                else -> {
                    ans = mid
                    left = mid + 1
                }
            }
        }

        return ans
    }
}