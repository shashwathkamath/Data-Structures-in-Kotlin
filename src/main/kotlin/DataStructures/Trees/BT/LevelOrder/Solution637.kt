package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution637 {

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val res = mutableListOf<Double>()
        if (root == null) return res.toDoubleArray()
        val q = ArrayDeque<TreeNode>()
        q.addLast(root)

        while (q.isNotEmpty()) {
            val size = q.size
            var currSum = 0L
            repeat(size) {
                val currentNode = q.removeFirst()
                currSum += currentNode.`val`
                currentNode.left?.let { q.addLast(it) }
                currentNode.right?.let { q.addLast(it) }
            }
            val avg = currSum.toDouble() / size
            res.add(avg)
        }

        return res.toDoubleArray()
    }
}