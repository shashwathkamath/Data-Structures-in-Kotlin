fun main() {
    // val nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
    // val k = 3

    // first negative Number problem solution
    /*
        val res = firstNegativeNumber(nums, k)
    println("size ${res.size}")
    res.forEach { println(it) }
     */
    /*
        val res = maxOfAllSubarray(nums, k)
    println("size ${res.size}")
    res.forEach { println(it) }
     */
    /*
        val str = "aabaabaa"
    val pattern = "aaba"
    val count = countOccurrenceOfAnagrams(str, pattern)
    println("Number of anagrams inside the string ---> $count")
     */

    /*
         val str = "eceba"
    val k = 2
    val res = lengthOfLongestSubstringKDistinct(str, k)
    println("lengthOfLongestSubstringKDistinct --> $res")
      */
    val str = "abcabcbb"
    val res = lengthOfLongestSubstring(str)
    println("lengthOfLongestSubstring ---> $res")
}
