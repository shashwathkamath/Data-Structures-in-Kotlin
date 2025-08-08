package Prep.practice.arrays

class Soluton136 {

    fun singleNumber(nums: IntArray): Int {
        var ans = 0

        nums.forEach { num ->
            ans = ans xor num
        }

        return ans
    }
}