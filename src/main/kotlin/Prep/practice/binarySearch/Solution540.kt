package Prep.practice.binarySearch

class Solution540 {

    fun singleNonDuplicate(nums: IntArray): Int {
        var st = 0
        var end = nums.size - 1
        if (nums.size == 1) return nums[0]
        while (st <= end) {
            val mid = st + (end - st) / 2
            //edge cases
            if (mid == 0 && nums[0] != nums[1]) return nums[mid]
            if (mid == nums.size - 1 && nums[nums.size - 1] != nums[nums.size - 2]) return nums[mid]

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid]

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    end = mid - 1
                } else {
                    st = mid + 1
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    st = mid + 1
                } else {
                    end = mid - 1
                }
            }
        }

        return -1
    }
}