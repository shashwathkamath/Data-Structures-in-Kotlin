package Prep

class Solution42 {

    fun trap(height: IntArray): Int {
        if (height.size < 3) return 0
        var left = 0
        var right = height.size - 1
        var water = 0
        var max = 0

        while (left < right) {
            if (height[left] <= height[right]) {
                max = maxOf(height[left], max)
                water += max - height[left]
                left++
            } else {
                max = maxOf(height[right], max)
                water += max - height[right]
                right--
            }
        }

        return water
    }
}