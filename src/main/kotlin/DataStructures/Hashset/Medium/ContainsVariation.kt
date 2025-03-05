fun containsVariation(s1: String, s2: String): Boolean {
    val patternMap = mutableMapOf<Char, Int>()
    val windowMap = mutableMapOf<Char, Int>()

    for (c in s1) {
        patternMap[c] = patternMap.getOrDefault(c, 0) + 1
    }
    var start = 0
    val k = s1.length

    for (end in s2.indices) {
        val rightChar = s2[end]
        windowMap[rightChar] = windowMap.getOrDefault(rightChar, 0) + 1

        if (end - start + 1 > k) {
            val leftChar = s2[start]
            if (windowMap.containsKey(leftChar)) {
                windowMap[leftChar] = windowMap[leftChar]!! - 1
                if (windowMap[leftChar] == 0) {
                    windowMap.remove(leftChar)
                }
            }
            start++
        }

        if (windowMap == patternMap) {
            return true
        }
    }

    return false
}
