package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution1161 {

    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0
        val q = ArrayDeque<TreeNode>()
        var maxSum = Integer.MIN_VALUE

        var maxLevel = 1
        var currLevel = 0

        q.addLast(root)

        while (q.isNotEmpty()) {
            val size = q.size
            var levelSum = 0
            currLevel++
            repeat(size) {
                val currNode = q.removeFirst()
                levelSum += currNode.`val`
                currNode.left?.let { q.addLast(it) }
                currNode.right?.let { q.addLast(it) }
            }
            if (levelSum > maxSum) {
                maxSum = levelSum
                maxLevel = currLevel
            }
        }
        return maxLevel
    }
}