package Prep.easy

class Solution66 {

    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.size - 1 downTo 0) {
            var sum = digits[i] + carry
            digits[i] = sum % 10
            carry = sum / 10
        }

        if (carry > 0) {
            var res = IntArray(digits.size + 1)
            res[0] = 1
            for (i in 0 until digits.size) {
                res[i + 1] = digits[i]
            }

            return res
        }

        return digits
    }
}