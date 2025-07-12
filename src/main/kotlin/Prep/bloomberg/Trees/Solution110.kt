package Prep.bloomberg.Trees

import Prep.epam.TreeNode
import kotlin.math.abs

class Solution110 {
    private var isBalanced = true

    fun isBalanced(root: TreeNode?): Boolean {
        height(root)
        return isBalanced
    }

    private fun height(root: TreeNode?): Int {
        if (root == null) return 0
        val left = height(root.left)
        val right = height(root.right)
        if (abs(left - right) > 1) {
            isBalanced = false
        }
        return 1 + maxOf(left, right)
    }
}