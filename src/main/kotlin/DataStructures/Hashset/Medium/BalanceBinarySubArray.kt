fun balancedBinarySubarray(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    map[0] = -1
    var prefixSum = 0
    var maxLen = 0

    for (i in nums.indices) {
        prefixSum += if (nums[i] == 0) -1 else 1

        if (map.containsKey(prefixSum)) {
            maxLen = maxOf(maxLen, i - map[prefixSum]!!)
        } else {
            map[prefixSum] = i
        }
    }

    return maxLen
}
