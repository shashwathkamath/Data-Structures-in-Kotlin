fun countSubstringsWithExactlyKDistinct(s: String, k: Int): Int {
    return countAtMostK(s, k) - countAtMostK(s, k - 1)
}

fun countAtMostK(s: String, k: Int): Int {
    if (k == 0) return 0
    var left = 0
    var totalCount = 0
    val map = mutableMapOf<Char, Int>()

    for (right in s.indices) {
        val rightChar = s[right]
        map[rightChar] = map.getOrDefault(rightChar, 0) + 1

        while (map.size > k) { // Shrink window when distinct chars exceed `k`
            val leftChar = s[left]
            map[leftChar] = map[leftChar]!! - 1
            if (map[leftChar] == 0) {
                map.remove(leftChar)
            }
            left++
        }

        // ✅ Correct count update
        totalCount += (right - left + 1)
    }

    return totalCount
}
