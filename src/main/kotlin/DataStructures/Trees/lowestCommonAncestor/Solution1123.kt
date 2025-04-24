package DataStructures.Trees.lowestCommonAncestor

import DataStructures.Trees.TreeNode

class Solution1123 {

    fun lcaDeepestLeaves(root: TreeNode?): TreeNode? {
        val deepestLeaves = findDeepestLeaves(root)
        return lca(root, deepestLeaves)
    }

    private fun lca(root: TreeNode?, deepestLeaves: List<Int>): TreeNode? {
        if (root == null) return null
        if (deepestLeaves.contains(root.`val`)) {
            return root
        }
        val left = lca(root.left, deepestLeaves)
        val right = lca(root.right, deepestLeaves)

        return when {
            left != null && right != null -> root
            left != null -> left
            else -> right
        }
    }

    private fun findDeepestLeaves(root: TreeNode?): List<Int> {
        val res = mutableListOf<MutableList<Int>>()
        if (root == null) return emptyList()

        val q = ArrayDeque<TreeNode>()
        q.addLast(root)

        while (q.isNotEmpty()) {
            val size = q.size
            val subList = mutableListOf<Int>()
            repeat(size) {
                val currentNode = q.removeFirst()
                subList.add(currentNode.`val`)
                currentNode.left?.let { q.addLast(it) }
                currentNode.right?.let { q.addLast(it) }
            }
            res.add(subList)
        }
        return res[res.size - 1]
    }
}