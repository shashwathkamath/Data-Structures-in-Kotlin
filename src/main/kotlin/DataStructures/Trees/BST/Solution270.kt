package DataStructures.Trees.BST

import DataStructures.Trees.TreeNode
import kotlin.math.abs

class Solution270 {

    fun closestValue(root: TreeNode?, target: Double): Int {
        var closest = root?.`val` ?: 0
        var current = root
        while (current != null) {
            val currDiff = abs(current.`val` - target)
            val closestDiff = abs(closest - target)

            if ((currDiff < closestDiff) ||
                ((currDiff == closestDiff) && current.`val` < closest)
            ) {
                closest = current.`val`
            }
            current = if (target < current.`val`) current.left else current.right
        }
        return closest
    }
}