package Prep.practice.binarySearch

class Solution852 {

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var st = 1
        var end = arr.size - 2

        while (st <= end) {
            val mid = st + (end - st) / 2
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid
            } else if (arr[mid - 1] < arr[mid]) {
                st = mid + 1
            } else {
                end = mid - 1
            }
        }

        return -1
    }
}