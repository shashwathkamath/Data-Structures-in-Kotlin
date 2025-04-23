package DataStructures.Trees.LevelOrder

import DataStructures.Trees.TreeNode

class Solution1001T {

    fun bottomView(root: TreeNode?): IntArray {
        if (root == null) return IntArray(0)
        val q = ArrayDeque<Pair<TreeNode, Int>>()
        q.addLast(Pair(root, 0))
        val map = sortedMapOf<Int, Int>()

        while (q.isNotEmpty()) {
            val size = q.size
            repeat(size) {
                val (currentNode, index) = q.removeFirst()
                map[index] = currentNode.`val`
                currentNode.left?.let { q.addLast(Pair(it, index - 1)) }
                currentNode.right?.let { q.addLast(Pair(it, index + 1)) }
            }
        }
        return map.values.toIntArray()
    }
}