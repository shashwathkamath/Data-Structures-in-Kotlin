package Prep.easy.Trees

import Prep.epam.TreeNode

class Solution102 {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (root == null) return res

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        while (queue.isNotEmpty()) {
            val subList = mutableListOf<Int>()

            repeat(queue.size) {
                val currentNode = queue.removeFirst()
                subList.add(currentNode.`val`)
                currentNode.left?.let { queue.addLast(it) }
                currentNode.right?.let { queue.addLast(it) }
            }

            res.add(subList)
        }

        return res
    }
}