package Prep.Bloomberg.Arrays

class Solution1539 {

    fun findKthPositive(arr: IntArray, k: Int): Int {
        var left = 0
        var right = arr.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            val missing = arr[mid] - mid - 1
            if (missing < k) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        val missingElementsTill = arr[right] - right - 1
        val numberOfElementsLeft = k - missingElementsTill

        return arr[right] + numberOfElementsLeft
    }
}