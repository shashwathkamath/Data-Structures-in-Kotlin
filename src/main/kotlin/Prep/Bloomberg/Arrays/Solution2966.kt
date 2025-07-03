package Prep.Bloomberg.Arrays

class Solution2966 {

    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        if (nums.isEmpty() || nums.size % 3 != 0) return emptyArray()
        val res = mutableListOf<IntArray>()
        nums.sort()
        var i = 0

        while (i < nums.size - 2) {
            if (nums[i + 2] - nums[i] <= k) {
                res.add(intArrayOf(nums[i], nums[i + 1], nums[i + 2]))
                i += 3
            } else {
                return emptyArray()
            }
        }

        return res.toTypedArray()
    }
}