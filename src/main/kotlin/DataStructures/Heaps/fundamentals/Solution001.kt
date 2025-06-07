package DataStructures.Heaps.fundamentals

import DataStructures.Trees.TreeNode

class Solution001 {

    fun treeHeapValidator(root: TreeNode?): Boolean {
        if (root == null) return true
        val queue = ArrayDeque<TreeNode?>()
        queue.addLast(root)
        var seen = false
        while (queue.isNotEmpty()) {
            val currNode = queue.removeFirst()
            if (currNode == null) {
                seen = true
            } else {
                if (seen) return false
                currNode.left?.let {
                    if (it.`val` < currNode.`val`) return false
                }
                currNode.right?.let {
                    if (it.`val` < currNode.`val`) return false
                }
                queue.addLast(currNode.left)
                queue.addLast(currNode.right)
            }
        }

        return true
    }
}