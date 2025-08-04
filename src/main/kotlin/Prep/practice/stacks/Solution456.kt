package Prep.practice.stacks

class Solution456 {

    fun find132pattern(nums: IntArray): Boolean {
        val st = ArrayDeque<Int>()
        var secondMax = Int.MIN_VALUE

        for (i in nums.size - 1 downTo 0) {
            val currentNum = nums[i]

            if (currentNum < secondMax) return true

            while (st.isNotEmpty() && currentNum > st.last()) {
                secondMax = st.removeLast()
            }
            st.addLast(currentNum)
        }

        return false
    }
}