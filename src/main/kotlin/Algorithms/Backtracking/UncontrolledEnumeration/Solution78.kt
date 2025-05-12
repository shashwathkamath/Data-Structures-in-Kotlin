package Algorithms.Backtracking.UncontrolledEnumeration

class Solution78 {

    fun subsets(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subList = mutableListOf<Int>()

        fun backtrack(i: Int) {
            if (i == nums.size) {
                res.add(subList.toList())
                return
            }
            res.add(subList.toList())
            for (j in i until nums.size) {
                subList.add(nums[j])
                backtrack(j + 1)
                subList.removeAt(subList.size - 1)
            }
        }
        backtrack(0)
        return res
    }
}