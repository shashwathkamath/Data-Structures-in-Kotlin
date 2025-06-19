package DataStructures.Trees.BST

import DataStructures.Trees.TreeNode

class Solution285 {

    fun inorderSuccessor(root: TreeNode?, p: TreeNode?): TreeNode? {
        var res: TreeNode? = null
        var current = root

        while (current != null) {
            if (p!!.`val` < current.`val`) {
                res = current
                current = current.left
            } else {
                current = current.right
            }
        }

        return res
    }
}