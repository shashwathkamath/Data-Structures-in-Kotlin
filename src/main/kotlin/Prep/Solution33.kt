package Prep

class Solution33 {

    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> {
                    return mid
                }

                nums[left] <= nums[mid] -> {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1
                    } else {
                        left = mid + 1
                    }
                }

                else -> {
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1
                    } else {
                        right = mid - 1
                    }
                }
            }
        }

        return -1
    }
}