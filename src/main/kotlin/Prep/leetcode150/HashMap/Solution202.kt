package Prep.leetcode150.HashMap

class Solution202 {

    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = processNumber(n)
        while (slow != fast) {
            slow = processNumber(slow)
            fast = processNumber(processNumber(fast))
        }
        return fast == 1
    }

    private fun processNumber(n: Int): Int {
        var currNum = n
        var total = 0

        while (currNum > 0) {
            val digit = currNum % 10
            total += digit * digit
            currNum = currNum / 10
        }

        return total
    }
}