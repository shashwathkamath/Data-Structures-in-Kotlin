package DataStructures.Trees.SimulataneousTraversal

import DataStructures.Trees.TreeNode

class Solution617 {

    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null) return root2
        if (root2 == null) return root1

        val newRoot = TreeNode(root1.`val` + root2.`val`)
        newRoot.left = mergeTrees(root1.left, root2.left)
        newRoot.right = mergeTrees(root1.right, root1.right)
        return newRoot
    }
}