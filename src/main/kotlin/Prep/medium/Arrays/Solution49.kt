package Prep.medium.Arrays

class Solution49 {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            if (!map.contains(key)) {
                map[key] = mutableListOf<String>()
            }
            val list = map[key]!!
            list.add(str)
            map[key] = list
        }

        return map.values.toList()
    }
}