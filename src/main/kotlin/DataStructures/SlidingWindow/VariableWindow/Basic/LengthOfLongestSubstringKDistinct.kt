fun lengthOfLongestSubstringKDistinct(s: String, k: Int): Int {
    // eceba
    var left = 0
    var max = 0
    val map = mutableMapOf<Char, Int>()

    for (right in s.indices) {
        val c = s[right]
        map[c] = map.getOrDefault(c, 0) + 1

        while (map.size > k) {
            val leftChar = s[left]
            if (map.containsKey(leftChar)) {
                map[leftChar] = map[leftChar]!! - 1
                if (map[leftChar] == 0) {
                    map.remove(leftChar)
                }

                left++
            }
        }
        max = maxOf(max, right - left + 1)
    }
    return max
}
