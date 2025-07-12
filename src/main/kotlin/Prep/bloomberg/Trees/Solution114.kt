package Prep.bloomberg.Trees

import Prep.epam.TreeNode

class Solution114 {

    fun flatten(root: TreeNode?): Unit {
        if (root == null) return
        val rightSubtree = root.right
        root.right = root.left
        root.left = null

        var current = root
        while (current?.right != null) {
            current = current?.right
        }

        current?.right = rightSubtree
        return flatten(root.right)
    }
}