package Prep

class Solution9 {

    fun isPalindrome(x: Int): Boolean {
        if (x / 10 == 0) return true
        if (x < 0) return false

        val xi = helper(x)
        return x == xi
    }

    private fun helper(x: Int): Int {
        var num = x
        var total = 0
        while (num > 0) {
            val unit = num % 10
            total += 10 * total + unit
            num = num / 10
        }

        return total
    }
}