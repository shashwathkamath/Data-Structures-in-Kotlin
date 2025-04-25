package DataStructures.Trees.SimulataneousTraversal

import DataStructures.Trees.TreeNode

class Solution101 {

    fun isSymmetric(root: TreeNode?): Boolean {
        return when {
            root == null -> true
            root.left?.`val` != root.right?.`val` -> false
            else -> helper(root.left, root.right)
        }
    }

    private fun helper(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p == null && q == null -> true
            p == null || q == null -> false
            helper(p.left, q.right) && helper(p.right, q.left) -> p.`val` == q.`val`
            else -> false
        }
    }
}

/**
 * fun isSymmetric(root: TreeNode?): Boolean {
 *         if (root == null) return true
 *         if (root.left?.`val` != root.right?.`val`) return false
 *         return helper(root.left, root.right)
 *     }
 *
 *     private fun helper(p: TreeNode?, q: TreeNode?): Boolean {
 *         if (p == null && q == null) return true
 *         if (p == null || q == null) return false
 *         val left = helper(p.left, q.right)
 *         val right = helper(p.right, q.left)
 *         return if (left && right) p.`val` == q.`val` else false
 *     }
 */