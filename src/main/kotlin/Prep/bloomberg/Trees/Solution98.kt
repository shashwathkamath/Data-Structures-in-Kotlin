package Prep.bloomberg.Trees

import Prep.epam.TreeNode

class Solution98 {

    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true
        return helper(root, null, null)
    }

    private fun helper(root: TreeNode?, min: Int?, max: Int?): Boolean {
        if (root == null) return true
        if (max != null && root.`val` >= max || min != null && root.`val` <= min) {
            return false
        }
        return helper(root.left, min, root.`val`) && helper(root.right, root.`val`, max)
    }
}