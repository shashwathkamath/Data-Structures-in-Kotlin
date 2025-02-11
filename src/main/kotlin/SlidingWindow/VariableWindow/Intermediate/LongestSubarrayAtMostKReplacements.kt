/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can MIDE-255flip at most k 0's.
Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined. */

fun longestOnes(nums: IntArray, k: Int): Int {
    var left = 0
    var maxCount = 0
    var countZeros = 0

    for (right in nums.indices) {
        if (nums[right] == 0) {
            countZeros++
        }
        while (countZeros > k) {
            if (nums[left] == 0) {
                countZeros--
            }
            left++
        }
        maxCount = maxOf(right - left + 1, maxCount)
    }
    return maxCount
}
