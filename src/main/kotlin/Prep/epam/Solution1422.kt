package Prep.epam

class Solution1422 {

    fun maxScore(s: String): Int {
        var leftZeroes = 0
        var rightOnes = s.count { it == '1' }
        var max = 0

        for (i in 0 until s.length - 1) {
            if (s[i] == '0') {
                leftZeroes++
            } else {
                rightOnes--
            }
            max = maxOf(max, leftZeroes + rightOnes)
        }

        return max
    }
}

/**
 *     fun maxScore(s: String): Int {
 *         val n = s.length
 *         var max = 0
 *
 *         for (i in 1 until n) {
 *             val newMax = countZeros(s.substring(0, i)) + countOnes(s.substring(i, n))
 *             max = maxOf(max, newMax)
 *         }
 *
 *         return max
 *     }
 *
 *     private fun countZeros(sub: String): Int {
 *         var count = 0
 *         val chArr = sub.toCharArray()
 *         chArr.forEach {
 *             if (it == '0') {
 *                 count++
 *             }
 *         }
 *
 *         return count
 *     }
 *
 *     private fun countOnes(sub: String): Int {
 *         var count = 0
 *         val chArr = sub.toCharArray()
 *         chArr.forEach {
 *             if (it == '1') {
 *                 count++
 *             }
 *         }
 *
 *         return count
 *     }
 */