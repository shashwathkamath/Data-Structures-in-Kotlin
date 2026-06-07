class Provinces{

    private fun numProvinces(adj:Array<IntArray>):Int{
        val n = adj.size
        val visited = BooleanArray(n) { false }
        val graph = buildGraph(adj)
        var res = 0

        fun helper(i:Int){
            visited[i] = true
             val connectedEdges = graph[i]
                connectedEdges?.forEach{
                    helper(it)
                }
        }

        for(i in 0 until(n)){
            if(!visited[i]){
               res++
               helper(i)
            }
        }
        return res
    }

    private fun buildGraph(adj:Array<IntArray>):MutableMap<Int,MutableList<Int>>{
        val map = mutableMapOf<Int,MutableList<Int>>()
        for(i in 0 until(adj.size)){
            for(j in 0 until(adj[0].size)){
                if(adj[i][j] == 1){
                    val u = i
                    val v = j
                    map.getOrPut(u) { mutableListOf() }.add(v)
                    map.getOrPut(v) { mutableListOf() }.add(u)
                }
            }
        }
        return map
    }
}