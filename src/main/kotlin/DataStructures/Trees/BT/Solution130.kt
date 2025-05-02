package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class Solution130 {

    fun maximumPathSum(root: TreeNode?): Int {
        if (root == null) return Int.MIN_VALUE
        if (root.left == null && root.right == null) return root.`val`
        val left = maximumPathSum(root.left)
        val right = maximumPathSum(root.right)
        return root.`val` + maxOf(left, right)
    }

}