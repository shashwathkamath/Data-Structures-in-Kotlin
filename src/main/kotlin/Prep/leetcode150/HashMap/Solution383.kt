package Prep.leetcode150.HashMap

class Solution383 {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.isEmpty() || magazine.isEmpty()) return false
        val arr = IntArray(26)
        ransomNote.forEach {
            arr[it - 'a']++
        }
        magazine.forEach {
            arr[it - 'a']--
        }

        arr.forEach {
            if (it > 0) {
                return false
            }
        }

        return true
    }
}