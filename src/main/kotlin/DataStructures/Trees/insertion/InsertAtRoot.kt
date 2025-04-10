package DataStructures.Trees.insertion

import DataStructures.Trees.TreeNode

class InsertAtRoot(private val root: TreeNode?) {

    fun insert(newValue: Int) {
        root?.left = TreeNode(newValue)
    }
}