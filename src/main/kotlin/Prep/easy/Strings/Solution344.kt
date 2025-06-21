package Prep.easy.Strings

class Solution344 {

    fun reverseString(s: CharArray): Unit {

        var i = 0
        var j = s.size - 1

        while (i < j) {
            val temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i++
            j--
        }
    }
}