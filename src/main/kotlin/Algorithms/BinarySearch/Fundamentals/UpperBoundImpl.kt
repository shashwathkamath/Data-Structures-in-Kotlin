package Algorithms.BinarySearch.Fundamentals

class UpperBoundImpl {

    fun upperBound(arr: IntArray, target: Int): Int {
        var low = 0
        var high = arr.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            when {
                arr[mid] <= target -> {
                    low = mid + 1
                }

                arr[mid] > target -> {
                    high = mid - 1
                }
            }
        }
        return low
    }
}