package Prep.practice.binarySearch

class Solution33 {

    fun search(nums: IntArray, target: Int): Int {
        var st = 0
        var end = nums.size - 1

        while (st <= end) {
            val mid = st + (end - st) / 2
            if (nums[mid] == target) return mid

            if (nums[st] < nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    end = mid - 1
                } else {
                    st = mid + 1
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1
                } else {
                    end = mid - 1
                }
            }
        }

        return -1
    }
}