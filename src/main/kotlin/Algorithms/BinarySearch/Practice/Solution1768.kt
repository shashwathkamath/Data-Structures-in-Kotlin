package Algorithms.BinarySearch.Practice

class Solution1768 {

    fun mergeAlternately(word1: String, word2: String): String {
        val sb = StringBuilder()
        var i = 0
        var j = 0

        while (i < word1.length && j < word2.length) {
            sb.append(word1[i])
            sb.append(word2[j])
            i++
            j++
        }
        while (i < word1.length) {
            sb.append(word1[i])
            i++
        }
        while (j < word2.length) {
            sb.append(word2[j])
            j++
        }

        return sb.toString()
    }
}