package Prep.easy.Others

class Solution191 {
    fun hammingWeight(n: Int): Int {
        var num = n
        var count = 0

        while (num != 0) {
            count += num and 1
            num = num ushr 1
        }

        return count
    }
}