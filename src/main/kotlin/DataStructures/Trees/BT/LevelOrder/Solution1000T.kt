package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution1000T {

    fun topView(root: TreeNode?): IntArray {
        val res = mutableListOf<Int>()
        if (root == null) return res.toIntArray()
        val q = ArrayDeque<Pair<TreeNode, Int>>()
        q.addLast(Pair(root, 0))

        val map = sortedMapOf<Int, Int>()

        while (q.isNotEmpty()) {
            val size = q.size
            repeat(size) {
                val (currentNode, index) = q.removeFirst()
                if (!map.containsKey(index)) {
                    map[index] = currentNode.`val`
                }
                currentNode.left?.let { q.addLast(Pair(it, index - 1)) }
                currentNode.right?.let { q.addLast(Pair(it, index + 1)) }
            }
        }

        return map.values.toIntArray()
    }
}