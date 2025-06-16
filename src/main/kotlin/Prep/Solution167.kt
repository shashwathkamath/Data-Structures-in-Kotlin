package Prep

class Solution167 {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val res = IntArray(2)
        for (i in numbers.indices) {
            val complement = target - numbers[i]
            if (map.contains(complement)) {
                val index = map[complement]!!
                res[0] = index + 1
                res[1] = i + 1
            } else {
                map[numbers[i]] = i
            }
        }

        return res
    }
}