package Algorithms.BinarySearch.Practice

class Solution540 {

    fun singleNonDuplicate(nums: IntArray): Int {
        var low = 0
        var high = nums.size - 1

        while (low < high) {
            var mid = low + (high - low) / 2
            if (mid % 2 == 1) {
                mid = mid - 1
            }
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2
            } else {
                high = mid
            }
        }

        return nums[low]
    }
}