package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class Solution001 {
    fun fullBinaryTree(root: TreeNode?): Boolean {
        return when {
            root == null -> true
            root.left == null && root.right == null -> true
            root.left == null || root.right == null -> false
            else -> fullBinaryTree(root.left) && fullBinaryTree(root.right)
        }
    }
}