package Prep.epam

class Solution408 {

    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        var i = 0
        var j = 0

        while (i < word.length && j < abbr.length) {
            when {
                abbr[j].isDigit() -> {
                    if (abbr[j] == '0') return false
                    var num = 0
                    while (j < abbr.length && abbr[j].isDigit()) {
                        num = num * 10 + (abbr[j] - '0')
                        j++
                    }
                    i += num
                }

                else -> {
                    if (word[i] != abbr[j]) {
                        return false
                    }
                    i++
                    j++
                }
            }

        }
        return i == word.length && j == abbr.length
    }
}