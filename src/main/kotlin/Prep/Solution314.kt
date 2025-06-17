package Prep

data class TreeNode(
    val `val`: Int,
    val left: TreeNode? = null,
    val right: TreeNode? = null
)

class Solution314 {

    fun verticalOrder(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (root == null) return res

        val queue = ArrayDeque<Triple<Int, Int, TreeNode>>()
        queue.addLast(Triple(0, 0, root))

        val map = sortedMapOf<Int, MutableList<Triple<Int, Int, TreeNode>>>()

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val (x, y, currNode) = queue.removeFirst()
                map.computeIfAbsent(x) { mutableListOf() }.add(Triple(x, y, currNode))

                currNode.left?.let {
                    queue.addLast(Triple(x - 1, y + 1, it))
                }

                currNode.right?.let {
                    queue.addLast(Triple(x + 1, y + 1, it))
                }
            }
        }
        for (key in map.keys) {
            val list = map[key]!!
            list.sortWith(compareBy({ it.second }, { it.first }))
            res.add(list.map { it.third.`val` })
        }

        return res
    }
}