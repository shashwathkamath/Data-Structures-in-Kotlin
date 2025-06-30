package Prep.Bloomberg.Trees

import Prep.epam.TreeNode

class Solution199 {

    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)
        val res = mutableListOf<Int>()

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val current = queue.removeFirst()

                if (i == size - 1) {
                    res.add(current.`val`)
                }
                current.left?.let { queue.addLast(it) }
                current.right?.let { queue.addLast(it) }
            }
        }

        return res
    }
}