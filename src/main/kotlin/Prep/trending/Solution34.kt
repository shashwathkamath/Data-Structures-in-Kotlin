package Prep.trending

class Solution34 {

    fun searchRange(nums: IntArray, target: Int): IntArray {

        fun binarySearch(nums: IntArray, first: Boolean): Int {
            var left = 0
            var right = nums.size - 1

            var index = -1

            while (left <= right) {
                val mid = left + (right - left) / 2
                when {
                    nums[mid] == target -> {
                        index = mid
                        if (first) {
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

        val start = binarySearch(nums, true)
        val end = binarySearch(nums, false)
        return arrayOf(start, end).toIntArray()
    }
}