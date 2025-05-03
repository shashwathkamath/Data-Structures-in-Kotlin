package DataStructures.Recurssion

/**
 * This is headRecurssion. This means, recurssion will happen first and then processing will be done.
 */
class Soution1001 {

    fun printValues(n: Int): IntArray {
        val list = mutableListOf<Int>()
        helper(n, list)
        return list.toIntArray()
    }

    private fun helper(n: Int, result: MutableList<Int>) {
        if (n == 0) return
        helper(n - 1, result)
        result.add(n)
    }
}