package DataStructures.Graphs.Basics

import DataStructures.Graphs.Node

class Solution1 {
    private val visited = mutableMapOf<Node, Node>()

    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        if (visited.contains(node)) return visited[node]
        val clone = Node(node.`val`)
        visited[node] = clone

        for (neighbor in node.neighbors) {
            if (neighbor != null) {
                clone.neighbors.add(cloneGraph(neighbor))
            }
        }

        return clone
    }
}