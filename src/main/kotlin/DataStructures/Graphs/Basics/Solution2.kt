package DataStructures.Graphs.Basics

class Solution2 {

    fun adjacencyListToAdjacencyMatrix(adjList: List<List<Int>>): Array<IntArray> {
        if (adjList.isEmpty()) return arrayOf()
        val n = adjList.size
        val adjMatrix = Array(n) { IntArray(n) { 0 } }

        for (i in adjList.indices) {
            for (j in adjList[i]) {
                if (j !in 0 until n) {
                    throw IllegalArgumentException("Illegal Index")
                }
                adjMatrix[i][j] = 1
                adjMatrix[j][i] = 1
            }
        }

        return adjMatrix
    }
}