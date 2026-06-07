class NumberOfIslands{

    private fun calNumOfIslands(grid:Array<IntArray>){
        val n = grid.size
        val visited = BooleanArray(n) { false }
        val graph = buildGraph(grid)
        var res = 0

        fun helper(i:Int){
            visited[i] = true
            val connected = graph[i]
            connected?.forEach{
                helper(it)
            }
        }

        for(i in 0 until(visited.size)){
            if(!visited[i]){
                helper(i)
                res++
            }
        }

    }

    private fun buildGraph(grid:Array<IntArray>):Map<Int,MutableList<Int>>{
        val map = mutableMapOf<Int,MutableList<Int>>()
        for(i in 0 until(grid.size)){
            for(j in 0 until(grid[0].size)){
                if(grid[i][j] == 1){
                    map.getOrPut(i) { mutableListOf() }.add(j)
                    map.getOrPut(j) { mutableListOf() }.add(i)
                }
            }
        }
        return map
    }
}