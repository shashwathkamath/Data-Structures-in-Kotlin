package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution958 {

    fun isCompleteTree(root: TreeNode?): Boolean {

        val q = ArrayDeque<TreeNode?>()
        q.addLast(root)

        while (q.first() != null) {
            val currentNode = q.removeFirst()
            q.addLast(currentNode?.left)
            q.addLast(currentNode?.right)
        }
        while (q.isNotEmpty() && q.first() == null) {
            q.removeFirst()
        }
        return q.isEmpty()
    }
}