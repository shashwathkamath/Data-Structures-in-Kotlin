package Prep.epam

class Solution242 {

    fun isAnagram(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Int>()

        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        for (c in t) {
            val count = map.getOrDefault(c, 0) - 1
            if (count < 0) return false
            map[c] = count
        }

        return map.values.all { it == 0 }
    }
}