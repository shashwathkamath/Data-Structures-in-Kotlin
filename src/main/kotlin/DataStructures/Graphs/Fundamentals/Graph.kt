package DataStructures.Graphs.Fundamentals

fun main() {
    val V = 4
    val graph = Array<MutableList<Edge>>(V) { mutableListOf() }

    GraphUtil().createGraph(graph)
    GraphUtil().printNeighbours(graph[2])
}

class GraphUtil {

    fun createGraph(graph: Array<MutableList<Edge>>) {
        for (i in 0 until graph.size) {
            graph[i] = mutableListOf()
        }

        graph[0].add(Edge(0, 2))

        graph[1].add(Edge(1, 2))
        graph[1].add(Edge(1, 3))

        graph[2].add(Edge(2, 0))
        graph[2].add(Edge(2, 1))
        graph[2].add(Edge(2, 3))

        graph[3].add(Edge(3, 1))
        graph[3].add(Edge(3, 2))
    }

    fun printNeighbours(each: MutableList<Edge>) {
        for (i in 0 until each.size) {
            val edge = each[i]
            println(edge.dst)
        }
    }
}

data class Edge(val src: Int, val dst: Int)