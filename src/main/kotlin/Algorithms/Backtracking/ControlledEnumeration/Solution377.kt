package Algorithms.Backtracking.ControlledEnumeration

class Solution377 {

    fun combinationSum4(nums: IntArray, target: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subList = mutableListOf<Int>()
        nums.sort()
        fun backtrack(index: Int, sum: Int) {
            if (sum == target) {
                res.add(subList.toList())
                return
            }
            if (sum > target) {
                return
            }
            for (i in index until nums.size) {
                if (nums[i] > target) continue
                subList.add(nums[i])
                backtrack(i + 1, sum + nums[i])
                subList.removeAt(subList.size - 1)
            }
        }
        backtrack(0, 0)
        println(res)
        return res
    }
}