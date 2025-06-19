package Prep.uber

class Solution49 {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val currentStr = str.toCharArray().sorted().joinToString("")
            map.putIfAbsent(currentStr, mutableListOf())
            map[currentStr]!!.add(str)
        }
        return map.values.toList()
    }
}