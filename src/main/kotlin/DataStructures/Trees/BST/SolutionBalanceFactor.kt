package DataStructures.Trees.BST

import DataStructures.Trees.TreeNode
import kotlin.math.abs

class SolutionBalanceFactor {
    fun balanceFactor(root: TreeNode?): Int {
        if (root == null) return 0

        val left = helper(root.left)
        val right = helper(root.right)
        val balance = abs(left - right)
        return balance
    }

    private fun helper(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + maxOf(helper(root.left), helper(root.right))
    }
}