package Prep.easy.Trees

import Prep.epam.TreeNode

class Solution104 {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
    }
}