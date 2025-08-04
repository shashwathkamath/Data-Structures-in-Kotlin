package Prep.practice.stacks

class Solution42 {
    fun trap(height: IntArray): Int {

        var max = 0
        var left = 0
        var right = height.size - 1
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