package Prep

class Solution49 {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            map.putIfAbsent(key, mutableListOf())
            map[key]!!.add(str)
        }

        return map.values.toList()
    }
}