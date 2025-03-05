fun homomorphicStrings(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val map1 = mutableMapOf<Char, Char>()
    val map2 = mutableMapOf<Char, Char>()

    for (i in s.indices) {
        val c1 = s[i]
        val c2 = t[i]

        if (map1.containsKey(c1) && map1[c1] != c2 || map2.containsKey(c2) && map2[c2] != c1) {
            return false
        }

        map1[c1] = c2
        map2[c2] = c1
    }
    return true
}

// pattern generation

fun generatePattern(s: String): String {
    val map = mutableMapOf<Char, Int>()
    var seed = 0
    var pattern = StringBuilder()

    for (c in s) {
        if (!map.containsKey(c)) {
            seed++
            map[c] = seed
        }
        pattern.append(map[c])
    }
    return pattern.toString()
}

fun homomorphicStringsPattern(s: String, t: String): Boolean {

    return generatePattern(s) == generatePattern(t)
}
