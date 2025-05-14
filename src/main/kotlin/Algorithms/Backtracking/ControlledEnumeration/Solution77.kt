package Algorithms.Backtracking.ControlledEnumeration

class Solution77 {

    fun combine(n: Int, k: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subList = mutableListOf<Int>()

        fun backtrack(index: Int) {
            if (subList.size == k) {
                res.add(subList.toList())
                return
            }
            for (i in index until n + 1) {
                subList.add(i)
                backtrack(i + 1)
                subList.removeAt(subList.size - 1)
            }
        }

        backtrack(1)
        return res
    }
}