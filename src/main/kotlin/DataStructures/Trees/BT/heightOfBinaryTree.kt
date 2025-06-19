package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

fun heightOfBinaryTree(root: TreeNode?): Int {
    if (root == null) return 0
    val heightOfLeft = heightOfBinaryTree(root.left)
    val heightOfRight = heightOfBinaryTree(root.right)
    val res = maxOf(heightOfLeft, heightOfRight)
    return 1 + res
}

