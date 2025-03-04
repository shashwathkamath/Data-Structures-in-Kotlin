fun buildPalindrome(s: String): Int {
    val charCount = IntArray(128)

    for (c in s) {
        charCount[c.code]++
    }
    var palindromeLen = 0
    var hasOdd = false

    for (i in charCount) {
        if (i % 2 == 0) {
            palindromeLen += i
        } else {
            palindromeLen -= i
            hasOdd = true
        }
    }
    if (hasOdd) {
        palindromeLen++
    }
    return palindromeLen
}
