package DataStructures.Trees.BT.SimulataneousTraversal

import DataStructures.Trees.TreeNode

class Solution572 {

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null || subRoot == null) return false
        if (sameTree(root, subRoot)) return true
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    private fun sameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p == null || q == null) return false
        val left = sameTree(p.left, q.left)
        val right = sameTree(p.right, q.right)
        return if (left && right) p.`val` == q.`val` else false
    }

}

/**
 * if (root == null && subRoot == null) return true
 *         if (root == null || subRoot == null) return false
 *         if (root.`val` == subRoot.`val`) {
 *             return helper(root,subRoot)
 *         }
 *         else{
 *
 *         }
 */