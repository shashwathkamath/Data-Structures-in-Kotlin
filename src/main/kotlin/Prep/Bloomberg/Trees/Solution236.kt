package Prep.Bloomberg.Trees

import Prep.epam.TreeNode

class Solution236 {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null
        when {
            root.`val` == p?.`val` -> return p
            root.`val` == q?.`val` -> return q
        }
        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)

        return when {
            left != null && right != null -> root
            left != null && right == null -> left
            else -> right
        }
    }
}