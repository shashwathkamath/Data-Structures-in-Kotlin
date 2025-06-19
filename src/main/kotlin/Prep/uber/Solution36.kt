package Prep.uber

class Solution36 {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        return if (search(nums, target, true) == -1)
            intArrayOf(-1, -1)
        else
            intArrayOf(search(nums, target, true), search(nums, target, false))
    }

    private fun search(nums: IntArray, target: Int, isFirst: Boolean): Int {
        var left = 0
        var right = nums.size - 1
        var index = -1

        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> {
                    index = mid
                    if (isFirst) {
                        right = mid - 1
                    } else {
                        left = mid + 1
                    }
                }

                nums[mid] > target -> {
                    right = mid - 1
                }

                else -> {
                    left = mid + 1
                }
            }
        }

        return index
    }
}