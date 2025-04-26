package DataStructures.Trees.BT.insertion

import DataStructures.Trees.TreeNode

fun insertIteratively(root: TreeNode?, newValue: Int): TreeNode {
    val newNode = TreeNode(newValue)
    if (root == null) return newNode
    val q = ArrayDeque<TreeNode>()
    q.addLast(root)

    while (q.isNotEmpty()) {
        val currentNode = q.removeFirst()
        if (currentNode.left == null) {
            currentNode.left = newNode
            return root
        } else if (currentNode.right == null) {
            currentNode.right = newNode
            return root
        } else {
            currentNode.left?.let { q.addLast(it) }
            currentNode.right?.let { q.addLast(it) }
        }
    }

    return root
}