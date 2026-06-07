class SolutionDfs{
    

    private fun dfsOfGraph(V:Int,edges:Array<IntArray>):List<Int>{
        val graph = buildAdjacencyList(edges)
        val visited = BooleanArray(V) { false }
        val result = mutableListOf<Int>()
        
        fun helper(i:Int,graph:MutableMap<Int,MutableList<Int>>,visited:BooleanArray){
            if(result.size == V) return
            if(visited[i]) return
            else{
                visited[i] = true
                result.add(i)
                val connectedNodes = graph[i]
                connectedNodes?.forEach{
                    helper(it, graph, visited)
                }
            }
        }
        helper(0,graph,visited)
        return result
    }

    private fun buildAdjacencyList(edges:Array<IntArray>):MutableMap<Int,MutableList<Int>>{
        val map = mutableMapOf<Int,MutableList<Int>>()
        edges.forEach { 
            val v = it[0]
            val u = it[1]

            map.getOrPut(v) { mutableListOf() }.add(u)
            map.getOrPut(u) { mutableListOf() }.add(v)
         }

         return map
    }
}