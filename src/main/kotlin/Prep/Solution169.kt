package Prep

class Solution169 {

    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var element = 0
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        map.forEach {
            if (it.value > nums.size / 2) {
                element = it.key
            }
        }

        return element
    }
}