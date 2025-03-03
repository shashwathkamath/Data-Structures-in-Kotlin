fun constructibilityCheck(s1: String, s2: String): Boolean {
    if (s2.length < s1.length) return false

    val map = mutableMapOf<Char, Int>()
    for (c in s1) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    for (c in s2) {
        if (map.containsKey(c)) {
            map[c] = map[c]!! - 1
            if (map[c] == 0) {
                map.remove(c)
            }
        }
    }

    return map.isEmpty()
}
