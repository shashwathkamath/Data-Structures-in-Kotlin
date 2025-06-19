package Algorithms.BinarySearch.Practice

class Solution81 {

    fun search(nums: IntArray, target: Int): Boolean {
        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            when {
                nums[mid] == target -> return true
                //handle duplicates
                nums[low] == nums[mid] && nums[mid] == nums[high] -> {
                    low++
                    high--
                }

                nums[low] <= nums[mid] -> {
                    if (target >= nums[low] && target < nums[mid]) {
                        high = mid - 1
                    } else {
                        low = mid + 1
                    }
                }

                else -> {
                    if (target > nums[mid] && target <= nums[high]) {
                        low = mid + 1
                    } else {
                        high = mid - 1
                    }
                }
            }
        }

        return false
    }
}