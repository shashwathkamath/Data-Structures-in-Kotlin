package Algorithms.Backtracking.UncontrolledEnumeration

class Solution46 {

    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()
        val visited = BooleanArray(nums.size) { false }

        fun backtrack() {
            if (current.size == nums.size) {
                result.add(current.toList())
                return
            }
            for (i in nums.indices) {
                if (!visited[i]) {
                    visited[i] = true
                    current.add(nums[i])
                    backtrack()

                    visited[i] = false
                    current.removeAt(current.size - 1)
                }
            }
        }

        backtrack()
        return result
    }
}
