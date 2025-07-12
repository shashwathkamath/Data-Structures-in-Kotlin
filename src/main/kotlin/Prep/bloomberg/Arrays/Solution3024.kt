package Prep.bloomberg.Arrays

class Solution3024 {

    fun triangleType(nums: IntArray): String {
        nums.sort()
        val x = nums[0]
        val y = nums[1]
        val z = nums[2]

        if (x + y <= z) return "none"

        return when {
            x == y && y == z -> "equilateral"
            x == y || y == z -> "isoceles"
            else -> "scalene"
        }
    }
}