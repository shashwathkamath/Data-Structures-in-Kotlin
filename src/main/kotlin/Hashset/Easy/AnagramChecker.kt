fun anagramChecker(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val charCount = IntArray(26)

    for (c in s) {
        charCount[c - 'a']++
    }

    for (c in t) {
        charCount[c - 'a']--
        if (charCount[c - 'a'] < 0) {
            return false
        }
    }

    return true
}
