package Algorithms.BinarySearch

class BinarySearchImpl {

    fun binarySearch(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1
        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = low + ((high - low) / 2)
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> high = mid - 1
                else -> low = mid + 1
            }
        }
        return -1
    }
}

