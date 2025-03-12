fun zeroSumSubarrays(nums: IntArray): MutableList<IntArray> {
    var prefixSum = 0
    val map = mutableMapOf<Int, Int>()
    map[0] = -1
    val res = mutableListOf<IntArray>()
    for (i in nums.indices) {
        prefixSum += nums[i]
        if (map.containsKey(prefixSum)) {
            res.add(intArrayOf(map[prefixSum]!! + 1, i))
        }

        map[prefixSum] = i
    }

    return res
}
