class Solution{

    fun bfsOfGraph(V:Int,edges:Array<IntArray>):List<Int>{
        val list = mutableListOf<Int>()
        val graph = buildAdjacencyList(edges)
        val visited = BooleanArray(V){false}
        val queue = ArrayDeque<Int>()
        
        queue.add(0)
        visited[0] = true
        while(queue.isNotEmpty()){
            val currentNode = queue.removeFirst()
            list.add(currentNode)
            val neighbors = graph[currentNode]
            neighbors?.forEach{
                if(!visited[it]){
                    queue.add(it)
                    visited[it] = true
                }
            }
        }
        return list
    }

    private fun buildAdjacencyList(edges:Array<IntArray>):Map<Int,MutableList<Int>>{
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