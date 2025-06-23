package Prep.easy.Trees

import Prep.epam.TreeNode

class Solution98 {

    fun isValidBST(root: TreeNode?): Boolean {
        var prev: Int? = null

        fun helper(root: TreeNode?): Boolean {
            if (root == null) return true
            if (!helper(root.left)) return false
            if (prev != null && prev!! >= root.`val`) return false
            prev = root.`val`
            return helper(root.right)
        }

        return helper(root)
    }
}