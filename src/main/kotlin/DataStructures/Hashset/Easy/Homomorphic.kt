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
