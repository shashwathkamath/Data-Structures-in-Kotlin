package Prep.Bloomberg.Arrays

class Solution1394 {

    fun findLucky(arr: IntArray): Int {
        val frequencyArr = IntArray(501)
        var ans = -1
        arr.forEach {
            frequencyArr[it]++
        }

        for (i in 1 until 501) {
            if (i == frequencyArr[i]) {
                ans = i
            }
        }
        return ans
    }
}