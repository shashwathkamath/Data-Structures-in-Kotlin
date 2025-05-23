package Algorithms.BinarySearch.Fundamentals

class Solution34 {

    fun searchRange(nums: IntArray, target: Int): IntArray {

        val res = IntArray(2) { -1 }

        fun binarySearch(isFirst: Boolean): Int {
            var low = 0
            var high = nums.size - 1
            var index = -1
            while (low <= high) {
                val mid = low + (high - low) / 2
                when {
                    nums[mid] == target -> {
                        index = mid
                        if (isFirst) {
                            high = mid - 1
                        } else {
                            low = mid + 1
                        }
                    }

                    nums[mid] > target -> {
                        high = mid - 1
                    }

                    else -> {
                        low = mid + 1
                    }
                }
            }
            return index
        }

        val first = binarySearch(true)
        if (first == -1) {
            res[0] = -1
            res[1] = -1
        }
        val last = binarySearch(false)
        res[0] = first
        res[1] = last

        return res
    }
}