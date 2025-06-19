package Prep.epam

class Solution70 {
    val map = mutableMapOf<Int, Int>()

    fun climbStairs(n: Int): Int {

        fun helper(steps: Int): Int {
            //base
            if (steps <= 1) return 1
            if (steps == 2) return 2

            map[steps]?.let { return it }
            val result = helper(steps - 1) + helper(steps - 2)
            map[steps] = result
            return result
        }
        return helper(n)
    }
}