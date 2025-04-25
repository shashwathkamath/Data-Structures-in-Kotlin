package DataStructures.Trees.SimulataneousTraversal

import DataStructures.Trees.TreeNode

class Solution100 {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p == null && q == null -> true
            p == null || q == null -> false
            isSameTree(p.left, q.left) && isSameTree(p.right, q.right) -> p.`val` == q.`val`
            else -> false
        }
    }
}

//if (p == null && q == null) return true
//        if (p == null || q == null) return false
//        val left = isSameTree(p.left, q.left)
//        val right = isSameTree(p.right, q.right)
//        return if (left && right) p.`val` == q.`val` else false