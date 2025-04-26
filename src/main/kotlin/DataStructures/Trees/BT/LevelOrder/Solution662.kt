package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution662 {

    fun widthOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0
        val q = ArrayDeque<Pair<TreeNode, Int>>()
        q.addLast(Pair(root, 0))
        var maxWidth = Integer.MIN_VALUE

        while (q.isNotEmpty()) {
            val size = q.size
            val firstIndex = q.first().second
            var lastIndex = 0
            repeat(size) {
                val (currentNode, index) = q.removeFirst()
                val actualIndex = index - firstIndex
                lastIndex = actualIndex
                currentNode.left?.let { q.addLast(Pair(it, 2 * actualIndex)) }
                currentNode.right?.let { q.addLast(Pair(it, 2 * actualIndex + 1)) }
            }
            maxWidth = maxOf(maxWidth, lastIndex - firstIndex + 1)
        }
        return maxWidth
    }
}