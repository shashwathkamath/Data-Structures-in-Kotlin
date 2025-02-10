fun lengthOfLongestSubstring(s: String): Int {

    var left = 0
    var max = 0
    val set = mutableSetOf<Char>()

    for (right in s.indices) {
        val c = s[right]
        while (set.contains(c)) {
            val leftChar = s[left]
            set.remove(leftChar)
            left++
        }
        set.add(c)
        max = maxOf(max, right - left + 1)
    }

    return max
}
