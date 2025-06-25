package Prep.easy.Others

class Solution461 {

    fun hammingDistance(x: Int, y: Int): Int {
        var res = x xor y
        var count = 0

        while (res != 0) {
            count += res and 1
            res = res ushr 1
        }

        return count
    }
}