package Prep.easy.Trees

import Prep.epam.TreeNode

class Solution101 {

    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return helper(root.left, root.right)
    }

    private fun helper(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p == null && q == null -> true
            p == null || q == null -> false
            p.`val` == q.`val` -> helper(p.left, q.right) && helper(p.right, q.left)
            else -> false
        }
    }
}