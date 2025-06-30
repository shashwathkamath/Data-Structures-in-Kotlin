package DataStructures.Graphs.Basics

class Solution3 {

    fun adjacencyMatrixToAdjacencyList(matrix: Array<IntArray>): List<List<Int>> {
        if (matrix.isEmpty()) return emptyList()

        val n = matrix.size

        val adjList = MutableList(n) { mutableListOf(n) }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (matrix[i][j] == 1) {
                    adjList[i].add(j)
                }
            }
        }

        return adjList
    }
}