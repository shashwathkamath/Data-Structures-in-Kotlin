package DataStructures.Trees.BT.insertion

import DataStructures.Trees.TreeNode

fun insertLeaf(root: TreeNode?, newValue: Int): TreeNode? {
    if (root == null) {
        return TreeNode(newValue)
    }
    root.left = insertLeaf(root.left, newValue)
    return root
}