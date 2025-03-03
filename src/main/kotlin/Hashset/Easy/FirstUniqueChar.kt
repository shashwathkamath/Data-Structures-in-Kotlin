fun firstUniqChar(s: String): Int {
    val map = mutableMapOf<Char, Int>()

    for (c in s) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    for (i in s.indices) {
        val c = s[i]
        if (map[c] == 1) {
            return i
        }
    }

    return -1
}
