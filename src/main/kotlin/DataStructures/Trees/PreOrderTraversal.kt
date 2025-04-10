package DataStructures.Trees

class Solution {
    private val res = mutableListOf<Int>()

    fun preOrderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return res
        helper(root)
        return res.toList()
    }

    private fun helper(root: TreeNode?) {
        if (root == null) return
        res.add(root.`val`)
        helper(root.left)
        helper(root.right)
    }
}
