package Prep.Bloomberg.Arrays

class Solution1424 {

    fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
        val res = mutableListOf<Int>()
        val map = sortedMapOf<Int, MutableList<Int>>()

        for (i in 0 until nums.size) {
            for (j in 0 until nums[i].size) {
                val sum = i + j
                if (!map.containsKey(sum)) {
                    map[sum] = mutableListOf<Int>()
                }
                map[sum]!!.add(nums[i][j])
            }
        }

        map.values.forEach { subList ->
            subList.reversed().forEach { res.add(it) }
        }

        return res.toIntArray()
    }
}