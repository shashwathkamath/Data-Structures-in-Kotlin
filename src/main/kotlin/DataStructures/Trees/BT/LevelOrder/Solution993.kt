package DataStructures.Trees.BT.LevelOrder

import DataStructures.Trees.TreeNode

class Solution993 {

//    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
//        if (root == null) return false
//        val q = ArrayDeque<TreeNode>()
//        q.addLast(root)
//
//        while (q.isNotEmpty()) {
//            val size = q.size
//            var xIsPresent = false
//            var yIsPresent = false
//            repeat(size) {
//                val currentNode = q.removeFirst()
//                when {
//                    currentNode.`val` == x -> xIsPresent = true
//                    currentNode.`val` == y -> yIsPresent = true
//                    currentNode.left != null && currentNode.right != null -> {
//                        val lv = currentNode.left!!.`val`
//                        val rv = currentNode.right!!.`val`
//                        if ((lv == x && rv == y) || (lv == y && rv == x)) return false
//                    }
//                }
//                currentNode.left?.let(q::addLast)
//                currentNode.right?.let(q::addLast)
//            }
//            if (xIsPresent && yIsPresent) return true
//            if (xIsPresent || yIsPresent) return false
//        }
//        return false
//    }

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) return false
        val xObj = helper(root, x, 0, root)
        val yObj = helper(root, y, 0, root)
        return xObj.first == yObj.first && xObj.second != yObj.second
    }

    fun helper(root: TreeNode?, x: Int, level: Int, parent: TreeNode?): Pair<Int, Int> {
        if (root == null) return Pair(-1, -1)

        if (root.`val` == x) {
            return Pair(level, parent!!.`val`)
        }

        val left = helper(root.left, x, level + 1, root)
        val right = helper(root.right, x, level + 1, root)

        return if (left.first == -1) right else left
    }
}