/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */
fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var left = 0
    var min = Int.MAX_VALUE
    var sum = 0

    for (right in nums.indices) {
        sum += nums[right]

        while (sum >= target) {
            min = minOf(min, right - left + 1)
            sum -= nums[left]
            left++
        }
    }
    return min
}
