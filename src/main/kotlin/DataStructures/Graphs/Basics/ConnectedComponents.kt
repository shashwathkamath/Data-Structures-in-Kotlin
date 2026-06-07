class Connected{


    private fun findNumberOfComponent(V:Int,edges:Array<IntArray>):Int{
        val graph = buildGraph(edges)
        val visited = BooleanArray(V) { false }
        var res = 0
        fun helper(edge:Int){
            visited[edge] = true
            val connectedEdges = graph[edge]
            connectedEdges?.forEach{
                helper(it)
            }
        }
        for (node in 0 until V) {
            if (!visited[node]) {
                res++
                helper(node)
            }
        }
        return res
    }

    private fun buildGraph(edges:Array<IntArray>):Map<Int,MutableList<Int>>{
        val map = mutableMapOf<Int,MutableList<Int>>()
        edges.forEach { 
            val u = it[0]
            val v = it[1]

            map.getOrPut(u) { mutableListOf() }.add(v)
            map.getOrPut(v) { mutableListOf() }.add(u)
        }
        return map
    }
}