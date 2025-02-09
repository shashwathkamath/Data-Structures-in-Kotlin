/**
 * int[] arr = {1, 3, -1, -3, 5, 3, 6, 7}; int k = 3; // here we need to find the max element for
 * each sub-array of given size k // so the answer would be 3, 3, 5, 5, 6, 7
 */
fun maxOfAllSubarray(nums: IntArray, k: Int): IntArray {
    var res = mutableListOf<Int>()
    var left = 0
    val deque = ArrayDeque<Int>()

    for (right in nums.indices) {
        while (deque.isNotEmpty() && deque.first() < nums[right]) {
            deque.removeFirst()
        }
        deque.add(right) // 4,5

        if (right - left + 1 == k) {
            while (deque.isNotEmpty() && deque.first() < left) {
                deque.removeFirst()
            }
            if (deque.isNotEmpty()) {
                res.add(nums[deque.first()]) // 3,3,5,
            }
            left++
        }
    }

    return res.toIntArray()
}
