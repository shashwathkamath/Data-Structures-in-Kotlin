package Prep.practice.arrays

class Solution287 {

    fun findDuplicate(nums: IntArray): Int {
        var slow = nums[0]
        var fast = nums[slow]

        while (slow != fast) {
            slow = nums[slow]
            fast = nums[nums[fast]]
        }
        slow = nums[0]
        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }

        return slow
    }
}