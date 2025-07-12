package Prep.bloomberg.Trees

import Prep.epam.TreeNode

class Solution314 {
    fun verticalOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val map = sortedMapOf<Int, MutableList<Pair<Int, TreeNode>>>()

        val queue = ArrayDeque<Triple<Int, Int, TreeNode>>()
        queue.add(Triple(0, 0, root))

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val (x, y, current) = queue.removeFirst()
                if (!map.contains(x)) {
                    map[x] = mutableListOf<Pair<Int, TreeNode>>()
                }
                map[x]!!.add(Pair(y, current))
                current.left?.let { queue.add(Triple(x - 1, y + 1, it)) }
                current.right?.let { queue.add(Triple(x + 1, y + 1, it)) }
            }
        }

        val res = mutableListOf<List<Int>>()
        map.keys.forEach {
            val list = map[it]!!
            list.sortedWith(compareBy({ it.first }))
            res.add(list.map { it.second.`val` })
        }

        return res
    }
}