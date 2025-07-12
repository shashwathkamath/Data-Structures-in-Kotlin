package Prep.meta

import Prep.epam.TreeNode

class Solution1650 {

    fun lowestCommonAncestor(p: Node?, q: Node?): Node? {
        if (p == null || q == null) return null
        val ancestors = mutableSetOf<Node?>()
        var current = p
        while (current != null) {
            ancestors.add(current)
            current = current.parent
        }
        current = q
        while (current != null) {
            if (ancestors.contains(current)) return current
            current = current.parent
        }

        return null
    }

    class Node {
        var left: TreeNode? = null
        var right: TreeNode? = null
        var parent: Node? = null
    }
}