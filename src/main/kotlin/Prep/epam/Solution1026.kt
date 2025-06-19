package Prep.epam

import kotlin.math.abs

class Solution1026 {

    fun maxAncestorDiff(root: TreeNode?): Int {
        var maxDiff = 0

        fun dfs(currentRoot: TreeNode?, minA: Int, maxA: Int) {
            if (currentRoot == null) return

            val currMinDiff = abs(currentRoot.`val` - minA)
            val currMaxDiff = abs(currentRoot.`val` - maxA)
            maxDiff = maxOf(maxDiff, maxOf(currMinDiff, currMaxDiff))

            val newMin = minOf(minA, currentRoot.`val`)
            val newMax = maxOf(maxA, currentRoot.`val`)

            dfs(currentRoot?.left, newMin, newMax)
            dfs(currentRoot?.right, newMin, newMax)
        }

        if (root != null) {
            dfs(root, root.`val`, root.`val`)
        }

        return maxDiff
    }
}