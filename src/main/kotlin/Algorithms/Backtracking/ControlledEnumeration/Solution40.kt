package Algorithms.Backtracking.ControlledEnumeration

class Solution40 {

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subList = mutableListOf<Int>()
        candidates.sort()

        fun backtrack(index: Int, sum: Int) {
            if (sum == target) {
                res.add(subList.toList())
                return
            }
            for (i in index until candidates.size) {
                if (i > index && candidates[i] == candidates[i - 1]) continue
                if (candidates[i] > target - sum) break

                subList.add(candidates[i])
                backtrack(i + 1, sum + candidates[i])
                subList.removeAt(subList.size - 1)
            }
        }

        backtrack(0, 0)
        return res
    }
}