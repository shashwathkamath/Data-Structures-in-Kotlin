package Algorithms.BinarySearch.Practice

class Solution153 {

    fun findMin(nums: IntArray): Int {
        var low = 0
        var high = nums.size - 1

        while (low < high) {
            val mid = low + (high - low) / 2

            when {
                nums[mid] > nums[high] -> low = mid + 1
                else -> high = mid
            }
        }

        return nums[low]
    }
}