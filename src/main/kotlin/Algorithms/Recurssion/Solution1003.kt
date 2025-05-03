package Algorithms.Recurssion

class Solution1003 {

    fun recursivelyPrintNumbersFromNTo1(n: Int): MutableList<Int> {
        if (n < 0) throw IllegalArgumentException("Input must be non negative")
        val result = mutableListOf<Int>()
        if (n == 0) return result
        helper(n, result)
        return result
    }

    private fun helper(n: Int, result: MutableList<Int>) {
        if (n == 0) return
        result.add(n)
        helper(n - 1, result)
    }
}