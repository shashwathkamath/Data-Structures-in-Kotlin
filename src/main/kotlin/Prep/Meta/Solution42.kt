package Prep.Meta

class Solution42 {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var max = 0
        var waterCollected = 0

        while (left < right) {
            if (height[left] <= height[right]) {
                max = maxOf(height[left], max)
                waterCollected += max - height[left]
                left++
            } else {
                max = maxOf(height[right], max)
                waterCollected += max - height[right]
                right--
            }
        }

        return waterCollected
    }
}