/*
 Count the number of occurrences of anagrams of a given pattern in a given string
Important Question (Here the size of the sliding window is not given in the input and we need to formulate it)
String str = "aabaabaa";
String pattern = "aaba";
*/

fun countOccurrenceOfAnagrams(str: String, pattern: String): Int {
    val k = pattern.length
    val patternMap = mutableMapOf<Char, Int>()
    val strMap = mutableMapOf<Char, Int>()

    for (c in pattern) {
        patternMap[c] = patternMap.getOrDefault(c, 0) + 1
    }

    // patternMap.forEach { println(it.value) }
    var left = 0
    var count = 0

    for (right in str.indices) {
        val c = str[right]
        strMap[c] = strMap.getOrDefault(c, 0) + 1

        if (right - left + 1 == k) {
            if (strMap == patternMap) {
                count++
            }
            val leftChar = str[left]
            if (strMap.containsKey(leftChar)) {
                strMap[leftChar] = strMap[leftChar]!! - 1
                if (strMap[leftChar] == 9) {
                    strMap.remove(leftChar)
                }
            }
            left++
        }
    }

    return count
}
