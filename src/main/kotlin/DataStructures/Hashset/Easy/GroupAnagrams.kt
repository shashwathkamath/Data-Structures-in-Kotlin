fun groupAnagram(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return emptyList()
    val map = mutableMapOf<String, MutableList<String>>()

    for (str in strs) {
        var sortedString = str.toCharArray().sorted().joinToString("")
        map.getOrPut(sortedString) { mutableListOf() }.add(str)
    }

    return map.values.toList()
}
