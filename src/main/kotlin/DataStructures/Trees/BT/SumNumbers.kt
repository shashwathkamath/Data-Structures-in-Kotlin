package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode

class Solution129 {
    var sum = 0

    fun sumNumbers(root: TreeNode?): Int {
        if (root == null) return 0
        helper(root, 0)
        return sum
    }

    private fun helper(root: TreeNode?, curr: Int) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            sum += curr * 10 + root.`val`
            return
        }
        var currSum = curr
        currSum = currSum * 10 + root.`val`
        helper(root.left, currSum)
        helper(root.right, currSum)
    }
}
