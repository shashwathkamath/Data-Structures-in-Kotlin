package Prep.bloomberg.Trees

import Prep.epam.TreeNode

class Solution105 {
    private var preIndex = 0

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        return helper(inorder, 0, inorder.size - 1, preorder)
    }

    private fun helper(inorder: IntArray, inStart: Int, inEnd: Int, preorder: IntArray): TreeNode? {
        if (inStart > inEnd) return null
        val root = TreeNode(preorder[preIndex])
        val rIndex = findRootIndex(inorder, preorder[preIndex])
        preIndex++
        root.left = helper(inorder, inStart, rIndex - 1, preorder)
        root.right = helper(inorder, rIndex + 1, inEnd, preorder)
        return root
    }

    private fun findRootIndex(inorder: IntArray, value: Int): Int {
        inorder.forEachIndexed { index, it ->
            if (it == value) {
                return index
            }
        }
        return -1
    }
}