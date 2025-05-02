package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class Duplicates() {
    private var duplicates = 0

    fun pathDuplicates(root: TreeNode?): Int {

        val map = mutableMapOf<Int, Int>()
        helper(root, map)
        return duplicates
    }

    private fun helper(root: TreeNode?, map: MutableMap<Int, Int>) {
        if (root == null) return;

        if (map.containsKey(root.`val`)) duplicates++
        map.getOrDefault(root.`val`, 0) + 1

        helper(root.left, map)
        helper(root.right, map)

        map[root.`val`] = map[root.`val`]!! - 1
        if (map[root.`val`] == 0) map.remove(root.`val`)
    }
}
