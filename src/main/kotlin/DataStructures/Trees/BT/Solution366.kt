package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class Solution366 {

    fun findLeaves(root: TreeNode?): List<List<Int>> {
        val list = mutableListOf<MutableList<Int>>()
        height(root, list)
        return list
    }

    private fun height(root: TreeNode?, list: MutableList<MutableList<Int>>): Int {
        if (root == null) return -1
        val left = height(root.left, list)
        val right = height(root.right, list)
        val currHeight = 1 + maxOf(left, right)
        if (list.size <= currHeight) {
            list.add(mutableListOf())
        }
        list[currHeight].add(root.`val`)
        return currHeight
    }
}