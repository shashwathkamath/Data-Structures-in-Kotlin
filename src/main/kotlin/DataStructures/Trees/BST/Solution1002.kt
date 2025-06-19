package DataStructures.Trees.BST

import DataStructures.Trees.TreeNode

class Solution1002 {

    fun recursiveInsertion(root: TreeNode?, data: Int): TreeNode? {
        if (root == null) return TreeNode(data)
        if (data < root.`val`) {
            root.left = recursiveInsertion(root.left, data)
        } else {
            root.right = recursiveInsertion(root.right, data)
        }
        return root
    }

    fun iterativeInsertion(root: TreeNode?, data: Int): TreeNode? {

        var current = root

        while (current != null) {
            if (data < current.`val`) {
                if (current.left == null) {
                    current.left = TreeNode(data)
                    break
                } else {
                    current = current.left
                }
            } else {
                if (current.right == null) {
                    current.right = TreeNode(data)
                    break
                } else {
                    current = current.right
                }
            }
        }
        return root
    }
}