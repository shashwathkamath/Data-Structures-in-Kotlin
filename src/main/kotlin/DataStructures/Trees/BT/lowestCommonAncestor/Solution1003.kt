package DataStructures.Trees.BT.lowestCommonAncestor

import DataStructures.Trees.TreeNode

class Solution1003 {

    fun distanceBetweenNodes(root: TreeNode?, valA: Int, valB: Int): Int {
        val lRoot = lca(root, valA, valB)
        val distanceA = distance(valA, Pair(lRoot, 0))
        val distanceB = distance(valB, Pair(lRoot, 0))
        return distanceA + distanceB
    }

    private fun distance(valueToFind: Int, pa: Pair<TreeNode?, Int>): Int {
        if (pa.first == null) return -1
        if (valueToFind == pa.first?.`val`) {
            return pa.second
        }
        val left = distance(valueToFind, Pair(pa.first?.left, pa.second + 1))
        val right = distance(valueToFind, Pair(pa.first?.right, pa.second + 1))
        return if (left == -1) right else left
    }

    private fun lca(root: TreeNode?, valA: Int, valB: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == valA || root.`val` == valB) {
            return root
        }
        val left = lca(root.left, valA, valB)
        val right = lca(root.right, valA, valB)

        return when {
            left != null && right != null -> root
            left != null -> left
            else -> right
        }
    }
}