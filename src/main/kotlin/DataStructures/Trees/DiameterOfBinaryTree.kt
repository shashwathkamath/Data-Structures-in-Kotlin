package DataStructures.Trees

class DiameterOfBinaryTree {

    private var diameter = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0
        helper(root)
        return diameter
    }

    private fun helper(root: TreeNode?): Int {
        if (root == null) return 0
        val left = helper(root.left)
        val right = helper(root.right)
        diameter = maxOf(diameter, left + right)
        return 1 + maxOf(left, right)
    }
}