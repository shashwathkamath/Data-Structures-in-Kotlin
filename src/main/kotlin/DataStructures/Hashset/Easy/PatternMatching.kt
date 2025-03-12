fun patternMatching(pattern: String, s: String): Boolean {

    val sArray = s.split(" ")
    if (pattern.length != sArray.size) return false
    // [hello world hello]
    val map1 = mutableMapOf<Char, String>()
    val map2 = mutableMapOf<String, Char>()

    for (i in pattern.indices) {
        val c = pattern[i] // m
        val word = sArray[i] // hello

        if ((map1.containsKey(c) && map1[c] != word) || map2.containsKey(word) && map2[word] != c) {
            return false
        }

        map1[c] = word // m -> hello
        map2[word] = c // hello -> m
    }

    return true
}
