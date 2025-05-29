package Algorithms.BinarySearch.Practice

class Solution852 {

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var low = 0
        var high = arr.size - 1

        while (low < high) {
            val mid = low + (high - low) / 2
            when {
                arr[mid] < arr[mid + 1] -> low = mid + 1
                else -> high = mid
            }
        }

        return low
    }
}