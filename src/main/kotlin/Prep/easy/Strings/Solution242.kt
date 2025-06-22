package Prep.easy.Strings

class Solution242 {

    fun isAnagram(s: String, t: String): Boolean {
        val sArray = IntArray(26) { 0 }
        val tArray = IntArray(26) { 0 }

        s.forEach {
            sArray[it - 'a']++
        }
        t.forEach {
            tArray[it - 'a']++
        }
        for (i in 0 until sArray.size) {
            if (sArray[i] != tArray[i]) {
                return false
            }
        }

        return true
    }
}