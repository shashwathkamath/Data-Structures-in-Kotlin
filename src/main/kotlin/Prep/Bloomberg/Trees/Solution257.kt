package Prep.Bloomberg.Trees

import Prep.epam.TreeNode

class Solution257 {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return emptyList()
        val res = mutableListOf<String>()

        fun helper(root: TreeNode?, path: StringBuilder) {
            if (root == null) return
            if (path.isNotEmpty()) path.append("->")
            path.append(root.`val`)

            if (root.left == null && root.right == null) {
                res.add(path.toString())
                return
            }

            helper(root.left, StringBuilder(path))
            helper(root.right, StringBuilder(path))
        }

        helper(root, StringBuilder())
        return res
    }
}