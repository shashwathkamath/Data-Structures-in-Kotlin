/**
 *
 * 1. Maximum Sum Subarray of Size K Problem: Given an array of integers and a number k, find the
 * maximum sum of any contiguous subarray of size k.
 *
 * Example: Input: nums = [2, 1, 5, 1, 3, 2], k = 3 Output: 9 (subarray [5, 1, 3] has the largest
 * sum = 9).
 */
fun maximumSubarraySum(nums: IntArray, k: Int): Int {
    var maxSum = Int.MIN_VALUE
    var sum = 0
    var left = 0

    for (right in nums.indices) {
        sum += nums[right]
        if (right - left + 1 == k) {
            maxSum = maxOf(maxSum, sum)
            sum -= nums[left]
            left++
        }
    }

    return maxSum
}
