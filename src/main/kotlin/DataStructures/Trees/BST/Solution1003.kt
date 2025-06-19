package DataStructures.Trees.BST

import DataStructures.Trees.TreeNode

class Solution1003 {

    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) return null

        when {
            key < root.`val` -> {
                root.left = deleteNode(root.left, key)
            }

            key > root.`val` -> {
                root.right = deleteNode(root.right, key)
            }

            else -> {
                if (root.left == null && root.right == null) return null
                if (root.left == null) return root.right
                if (root.right == null) return root.left

                val min = findMin(root.right)
                root.`val` = min!!.`val`
                root.right = deleteNode(root.right, min.`val`)
                return root
            }
        }

        return root
    }

    private fun findMin(node: TreeNode?): TreeNode? {
        var current = node
        while (current?.left != null) {
            current = current.left
        }
        return current
    }
}