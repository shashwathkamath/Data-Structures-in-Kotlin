package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class MonotonicPath {
    private var length = 0

    fun monotonicPath(root: TreeNode?): Int {
        helper(root)
        return length
    }

    private fun helper(root: TreeNode?): Int {
        if (root == null) return 0
        val left = helper(root.left)
        val right = helper(root.right)
        var leftPath = 0
        var rightPath = 0
        if (root.left != null && root.left?.`val` == root.`val`) {
            leftPath = left + 1
        }
        if (root.right != null && root.right?.`val` == root.`val`) {
            rightPath = right + 1
        }
        length = maxOf(length, leftPath + rightPath)
        return 1 + maxOf(leftPath, rightPath)
    }
}