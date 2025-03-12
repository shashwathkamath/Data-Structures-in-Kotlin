fun anagramFinder(s: String, p: String): MutableList<Int> {
    val patternMap = mutableMapOf<Char, Int>()
    val windowMap = mutableMapOf<Char, Int>()

    for (c in p) {
        patternMap[c] = patternMap.getOrDefault(c, 0) + 1
    }

    var start = 0
    val k = p.length
    val res = mutableListOf<Int>()

    for (end in s.indices) {
        val rightChar = s[end]
        windowMap[rightChar] = windowMap.getOrDefault(rightChar, 0) + 1

        if (end - start + 1 > k) {
            val leftChar = s[start]
            if (windowMap.containsKey(leftChar)) {
                windowMap[leftChar] = windowMap[leftChar]!! - 1
                if (windowMap[leftChar]!! == 0) {
                    windowMap.remove(leftChar)
                }
            }
            start++
        }

        if (patternMap == windowMap) {
            res.add(start)
        }
    }

    return res
}
