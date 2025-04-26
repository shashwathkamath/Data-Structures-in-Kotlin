package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

fun leftView(root: TreeNode?): List<Int> {
    val res = mutableListOf<Int>()
    if (root == null) return res
    val queue = ArrayDeque<TreeNode>()
    queue.addLast(root)
    while (queue.isNotEmpty()) {
        val size = queue.size
        for (i in 0 until size) {
            val currentNode = queue.removeFirst()
            if (i == 0) {
                res.add(currentNode.`val`)
            }
            currentNode.left?.let { queue.addLast(it) }
            currentNode.right?.let { queue.addLast(it) }
        }
    }

    return res
}