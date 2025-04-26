package DataStructures.Trees.BT.lowestCommonAncestor

import DataStructures.Trees.TreeNode

class Solution236 {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null

        if (p?.`val` == root.`val` || q?.`val` == root.`val`) {
            return root
        }

        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)

        return when {
            left != null && right != null -> root
            left != null -> left
            else -> right
        }
    }
}