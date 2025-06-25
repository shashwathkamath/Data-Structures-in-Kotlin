package Prep.easy.Math

class Solution204 {

    fun countPrimes(n: Int): Int {
        if (n <= 2) return 0
        val isPrime = BooleanArray(n) { it >= 2 }

        for (i in 2 until n) {
            if (i * i >= n) break
            if (isPrime[i]) {
                for (j in i * i until n step i) {
                    isPrime[j] = false
                }
            }
        }
        return isPrime.count { it }
    }
}