package DataStructures.Trees.LevelOrder

import DataStructures.Trees.TreeNode

class Solution1302 {

    fun deepestLeavesSum(root: TreeNode?): Int {
        if (root == null) return 0
        var deepestSum = 0
        val q = ArrayDeque<TreeNode>()
        q.addLast(root)
        while (q.isNotEmpty()) {
            val size = q.size
            var currSum = 0
            repeat(size) {
                val currentNode = q.removeFirst()
                currSum += currentNode.`val`
                currentNode.left?.let { q.addLast(it) }
                currentNode.right?.let { q.addLast(it) }
            }
            deepestSum = currSum
        }
        return deepestSum
    }
}