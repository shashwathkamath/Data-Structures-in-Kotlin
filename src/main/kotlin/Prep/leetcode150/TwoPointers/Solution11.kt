package Prep.leetcode150.TwoPointers

class Solution11 {

    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size - 1
        var maxArea = 0

        while (i < j) {
            val width = j - i
            val currHeight = minOf(height[i], height[j])
            val area = width * currHeight
            maxArea = maxOf(maxArea, area)
            if (height[i] < height[j]) {
                i++
            } else {
                j--
            }
        }

        return maxArea
    }
}