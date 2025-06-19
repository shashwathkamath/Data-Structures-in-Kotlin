package Prep.epam

class Solution11 {

    fun maxArea(height: IntArray): Int {
        var area = Int.MIN_VALUE
        var left = 0
        var right = height.size - 1

        while (left < right) {
            val ht = minOf(height[left], height[right])
            val width = right - left
            val currentArea = ht * width
            area = maxOf(area, currentArea)
            if (height[left] < height[right]) left++
            else {
                right--
            }
        }

        return area
    }
}