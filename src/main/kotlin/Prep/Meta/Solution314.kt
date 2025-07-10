package Prep.Meta

import Prep.epam.TreeNode

class Solution314 {

    fun verticalOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val map = sortedMapOf<Int, MutableList<Pair<Int, TreeNode>>>()
        val queue = ArrayDeque<Triple<Int, Int, TreeNode>>()
        queue.addLast(Triple(0, 0, root))

        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val (x, y, current) = queue.removeFirst()
                if (!map.containsKey(x)) {
                    map[x] = mutableListOf()
                }
                map[x]!!.add(Pair(y, current))
                current.left?.let { queue.addLast(Triple(x - 1, y + 1, it)) }
                current.right?.let { queue.addLast(Triple(x + 1, y + 1, it)) }
            }
        }
        val res = mutableListOf<List<Int>>()
        map.values.forEach { listOfPair ->
            val subList = mutableListOf<Int>()
            listOfPair.forEach {
                subList.add(it.second.`val`)
            }
            res.add(subList)
        }

        return res
    }
}