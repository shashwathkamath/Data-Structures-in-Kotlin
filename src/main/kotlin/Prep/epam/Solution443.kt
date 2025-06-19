package Prep.epam

class Solution443 {

    fun compress(chars: CharArray): Int {
        var writePos = 0
        var readPos = 0

        while (readPos < chars.size) {
            val currentChar = chars[readPos]
            var count = 0

            while (readPos < chars.size && currentChar == chars[readPos]) {
                count++
                readPos++
            }

            chars[writePos++] = currentChar
            if (count > 1) {
                for (digit in count.toString()) {
                    chars[writePos++] = digit
                }
            }
        }

        return writePos
    }
}