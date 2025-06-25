package Prep.easy.Others

class Solution118 {

    fun generate(numRows: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()

        for (row in 0 until numRows) {
            val currentRow = mutableListOf<Int>()
            for (col in 0..row) {
                if (col == 0 || col == row) {
                    currentRow.add(1)
                } else {
                    val prevRow = res[row - 1]
                    currentRow.add(prevRow[col - 1] + prevRow[col])
                }
            }

            res.add(currentRow)
        }

        return res
    }
}