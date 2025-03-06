import kotlin.comparisons.maxOf

fun maximalCharacterSwap(s: String, k: Int): Int {
    if (s.length < k) {
        return s.length
    }
    val map = mutableMapOf<Char, Int>()
    var start = 0
    var maxLen = 0
    var maxFreq = 0

    for (end in s.indices) {
        val rightChar = s[end]
        map[rightChar] = map.getOrDefault(rightChar, 0) + 1
        maxFreq = maxOf(maxFreq, map[rightChar]!!)

        if (end - start + 1 - maxFreq > k) {
            val leftChar = s[start]
            map[leftChar] = map[leftChar]!! - 1
            if (map[leftChar] == 0) {
                map.remove(leftChar)
            }
            start++
        }

        maxLen = maxOf(maxLen, end - start + 1)
    }

    return maxLen
}
