package Prep.easy.Strings

class Solution28 {

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        if (needle.length > haystack.length) return -1

        for (i in 0..haystack.length - needle.length) {
            var matches = true
            for (j in 0 until needle.length) {
                if (haystack[i + j] != needle[j]) {
                    matches = false
                    break
                }
            }
            if (matches) return i
        }

        return -1
    }
}