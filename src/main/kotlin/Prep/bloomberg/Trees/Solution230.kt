package Prep.bloomberg.Trees

import Prep.epam.TreeNode

class Solution230 {
    private var count = 0
    private var ans = 0

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if (root == null) return 0

        fun helper(root: TreeNode?) {
            if (root == null) return
            helper(root.left)
            count++
            if (count == k) {
                ans = root.`val`
                return
            }
            helper(root.right)
        }
        helper(root)
        return ans
    }
}