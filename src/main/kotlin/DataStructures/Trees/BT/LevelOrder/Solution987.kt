package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution987 {
    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (root == null) return res
        val q = ArrayDeque<Triple<TreeNode, Int, Int>>()
        q.addLast(Triple(root, 0, 0))
        val map = sortedMapOf<Int, MutableList<Int>>()

        while (q.isNotEmpty()) {
            val size = q.size
            repeat(size) {
                val (currentNode, xIndex, yIndex) = q.removeFirst()
                if (!map.containsKey(xIndex)) {
                    map[xIndex] = mutableListOf<Int>()
                } else {
                    //based on yIndex, order of list will be decided.
                    //if the element has same yIndex, then sorted values among them will be taken into consideration
                    val nodeList = map[xIndex]
                    val element = nodeList?.get(yIndex)
                    if (element == null) {
                        map[xIndex]!!.add(yIndex, currentNode.`val`)
                    } else {
                        map[xIndex]!!.add(yIndex + 1, currentNode.`val`)
                    }
                }
                currentNode.left?.let { q.addLast(Triple(it, xIndex - 1, yIndex + 1)) }
                currentNode.right?.let { q.addLast(Triple(it, xIndex + 1, yIndex + 1)) }
            }
        }
        return map.values.toList()
    }
}