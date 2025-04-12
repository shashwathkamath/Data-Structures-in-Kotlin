package DataStructures.Trees

class LeavesSum {

    fun sumOfLeaves(root: TreeNode?): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null) return root.`val`
        return sumOfLeaves(root.left) + sumOfLeaves(root.right)
    }


}