package Prep.Bloomberg.Trees.Hard

import Prep.epam.TreeNode

class Solution124 {

    private var pathSum = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
        if (root == null) return 0
        helper(root)
        return pathSum
    }

    private fun helper(root: TreeNode?): Int {
        if (root == null) return 0

        val left = maxOf(0, helper(root.left))
        val right = maxOf(0, helper(root.right))
        pathSum = maxOf(pathSum, root.`val` + left + right)
        return root.`val` + maxOf(left, right)
    }
}