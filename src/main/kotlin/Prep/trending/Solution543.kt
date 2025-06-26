package Prep.trending

import Prep.epam.TreeNode
import kotlin.math.max

class Solution543 {

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0
        var diameter = 0

        fun helper(root: TreeNode?): Int {
            if (root == null) return 0
            val left = helper(root.left)
            val right = helper(root.right)
            diameter = maxOf(diameter, left + right)
            return 1 + max(left, right)
        }
        helper(root)
        return diameter
    }
}