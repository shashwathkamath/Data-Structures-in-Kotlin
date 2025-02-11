fun main() {
  // val nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
  // val k = 3

  // first negative Number problem solution
  val nums = intArrayOf(12, -1, -7, 8, -15, 30, 16, 28)
  val res = firstNegativeNumber(nums, 3)
  println("size ${res.size}")
  res.forEach { println(it) }

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

  /*
        val str = "abcabcbb"
  val res = lengthOfLongestSubstring(str)
  println("lengthOfLongestSubstring ---> $res")
    */

  /*
        val nums = intArrayOf(2, 3, 1, 2, 4, 3)
  val res = minSubArrayLen(7, nums)
  println("minSubArrayLen ---> $res")
     */
  /*
        val s = "pqpqps"
  val count = countSubstringsWithExactlyKDistinct(s, 2)
  println("Result Count ---> $count")
     */
  /*
        val nums = intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0)
  val count = longestOnes(nums, 2)
  println("Count ---> $count")
     */

}
