package Prep.easy.Arrays

class Solution36 {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxes = Array(9) { mutableSetOf<Char>() }

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val digit = board[i][j]
                if (digit == '.') continue
                if (!rows[i].add(digit)) return false
                if (!cols[j].add(digit)) return false
                val boxIndex = (i / 3) * 3 + j / 3
                if (!boxes[boxIndex].add(digit)) return false
            }
        }

        return true
    }
}