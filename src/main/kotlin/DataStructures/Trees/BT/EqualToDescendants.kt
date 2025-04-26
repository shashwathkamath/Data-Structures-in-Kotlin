package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class Solution1973 {
    private var count = 0

    fun equalToDescendants(root: TreeNode?): Int {
        if (root == null) return 0
        helper(root)
        return count
    }

    private fun helper(root: TreeNode?): Int {
        if (root == null) return 0
        val left = helper(root.left)
        val right = helper(root.right)
        val localSum = left + right
        if (localSum == root.`val`) {
            count++
        }
        return localSum + root.`val`
    }
}

