package Algorithms.Backtracking.UncontrolledEnumeration

class Solution90 {

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (nums.isEmpty()) return res
        val subList = mutableListOf<Int>()

        fun backtrack(i: Int) {
            res.add(subList.toList())

            for (j in i until nums.size) {
                if (j > i && nums[j] == nums[j - 1]) continue
                subList.add(nums[j])
                backtrack(j + 1)
                subList.removeAt(subList.size - 1)
            }
        }
        backtrack(0)
        return res
    }
}