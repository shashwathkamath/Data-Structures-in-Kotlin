package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution103 {

    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (root == null) return res
        val q = ArrayDeque<TreeNode>()
        q.addLast(root)
        var flip = true

        while (q.isNotEmpty()) {
            val list = mutableListOf<Int>()
            val size = q.size
            repeat(size) {
                val currentNode = q.removeFirst()
                list.add(currentNode.`val`)
                if (!flip) {
                    currentNode.left?.let { q.addLast(it) }
                    currentNode.right?.let { q.addLast(it) }
                } else {
                    currentNode.right?.let { q.addLast(it) }
                    currentNode.left?.let { q.addLast(it) }
                }
            }
            res.add(list)
            flip = !flip
        }
        return res
    }
}
