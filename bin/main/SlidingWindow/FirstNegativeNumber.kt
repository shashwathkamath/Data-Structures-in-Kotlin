/**
 * First Negative Number in Every Window of Size K Problem: Given an array of integers that can have
 * both positive and negative numbers, for each contiguous subarray of size k, find the first
 * negative number in that window. If no negative number is found, output 0 or some placeholder.
 *
 * Example: Input: nums = [12, -1, -7, 8, -15, 30, 16, 28], k = 3 Output: [-1, -1, -7, -15, -15, 0]
 */
/*
//O(n*k)
 fun firstNegativeNumber(nums: IntArray, k: Int): IntArray {
    // Todo: Implement it
    val output = mutableListOf<Int>()
    var left = 0

    for (right in nums.indices) {
        println("Right pointer $right")
        if (right - left + 1 == k) {
            val negativeNumber = findFirstNegativeNumber(nums, left, right)
            output.add(negativeNumber)
            left++
        }
    }

    return output.toIntArray()
}

fun findFirstNegativeNumber(nums: IntArray, left: Int, right: Int): Int {
    var i = left
    var j = right

    while (i <= j) {
        if (nums[i] < 0) {
            return nums[i]
        }
        i++
    }
    return 0
}

*/

fun firstNegativeNumber(nums: IntArray, k: Int): IntArray {
    var left = 0
    var res = mutableListOf<Int>()
    var deque = ArrayDeque<Int>()

    for (right in nums.indices) {
        if (nums[right] < 0) {
            // tracking indices
            deque.add(right)
        }
        if (right - left + 1 == k) {
            while (deque.isNotEmpty() && deque.first() < left) {
                deque.removeFirst()
            }

            // If no negative number in the current window, add 0; otherwise, add the first
            // negative.
            if (deque.isEmpty()) {
                res.add(0)
            } else {
                res.add(nums[deque.first()])
            }
            // Slide the window by moving left
            left++
        }
    }

    return res.toIntArray()
}
