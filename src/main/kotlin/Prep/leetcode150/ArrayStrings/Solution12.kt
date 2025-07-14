package Prep.leetcode150.ArrayStrings

class Solution12 {

    fun intToRoman(num: Int): String {
        val romanPairs = listOf(
            1000 to "C",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        val res = StringBuilder()
        var remainNum = num

        for ((value, symbol) in romanPairs) {
            while (remainNum >= value) {
                res.append(symbol)
                remainNum -= value
            }
        }
        return res.toString()
    }
}