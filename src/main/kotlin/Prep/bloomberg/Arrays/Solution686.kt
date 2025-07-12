package Prep.bloomberg.Arrays

class Solution686 {

    fun repeatedStringMatch(a: String, b: String): Int {
        val times = (b.length + a.length - 1) / a.length
        val sb = StringBuilder()

        repeat(times) {
            sb.append(a)
        }
        if (a.contains(b)) return times

        sb.append(a)
        if (sb.contains(b)) return times + 1
        return -1
    }
}