package Prep.leetcode150.HashMap

class Solution290 {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map = mutableMapOf<Char, String>()
        val sArr: List<String> = s.split(" ")
        if (pattern.length < sArr.size) return false
        pattern.forEachIndexed { i, char ->
            when {
                map.containsKey(char) && sArr[i] != map[char] -> return false
                !map.containsKey(char) && map.values.contains(sArr[i]) -> return false
                else -> map[char] = sArr[i]
            }
        }

        return true
    }
}