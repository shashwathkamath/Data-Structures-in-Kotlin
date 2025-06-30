package Prep.medium.Trees

import Prep.epam.TreeNode

class Solution94 {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        val st = ArrayDeque<TreeNode>()
        val res = mutableListOf<Int>()
        var current = root


        while (current != null || st.isNotEmpty()) {

            while (current != null) {
                st.addLast(current)
                current = current.left
            }

            current = st.removeLast()
            res.add(current.`val`)
            current = current.right
        }

        return res.toList()
    }
}