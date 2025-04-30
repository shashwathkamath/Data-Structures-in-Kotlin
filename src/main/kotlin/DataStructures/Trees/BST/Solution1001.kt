package DataStructures.Trees.BST

import DataStructures.Trees.TreeNode

class Solution1001 {

    fun recursiveSearch(root: TreeNode?, target: Int): TreeNode? {
        if (root == null) return null
        return when {
            root.`val` == target -> root
            target < root.`val` -> recursiveSearch(root.left, target)
            else -> recursiveSearch(root.right, target)
        }
    }
}