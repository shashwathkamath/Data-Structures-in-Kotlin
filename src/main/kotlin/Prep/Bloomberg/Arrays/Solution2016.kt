package Prep.Bloomberg.Arrays

class Solution2016 {

    fun maximumDifference(nums: IntArray): Int {
        if (nums.size < 2) return -1
        var minSofar = nums[0]
        var maxDiff = -1

        for (i in 1 until nums.size) {
            if (nums[i] > minSofar) {
                maxDiff = maxOf(maxDiff, nums[i] - minSofar)
            }
            minSofar = minOf(minSofar, nums[i])
        }

        return maxDiff
    }
}