package DataStructures.Trees

import kotlin.math.abs

class Height {


    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        return helper(root) != -1
    }

    private fun helper(root: TreeNode?): Int {
        if (root == null) return 0
        val leftHeight = helper(root.left)
        val rightHeight = helper(root.right)
        val diff = abs(leftHeight - rightHeight)
        if (diff > 1) {
            return -1
        }
        return 1 + maxOf(leftHeight, rightHeight)
    }

    private fun isPerfect(root: TreeNode?): Boolean {
        if (root == null) return true
        return helperPerfect(root) != -1
    }

    private fun helperPerfect(root: TreeNode?): Int {
        if (root == null) return 0
        val left = helperPerfect(root.left)
        val right = helperPerfect(root.right)
        if (left != right) {
            return -1
        }
        return 1 + maxOf(helperPerfect(root.left), helperPerfect(root.right))
    }
}