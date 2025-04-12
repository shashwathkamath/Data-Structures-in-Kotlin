package DataStructures.Trees

class SecondMinimum {
    private var firstMin = Int.MAX_VALUE
    private var secondMinimum = Int.MAX_VALUE

    fun secondMinimum(root: TreeNode?): Int {
        if (root == null) return -1
        helper(root)
        return if (secondMinimum == Int.MAX_VALUE) -1 else secondMinimum
    }

    private fun helper(root: TreeNode?) {
        if (root == null) return
        val currentValue = root.`val`
        if (currentValue < firstMin) {
            firstMin = currentValue
        } else if (currentValue > firstMin && currentValue < secondMinimum) {
            secondMinimum = currentValue
        }
        helper(root.left)
        helper(root.right)
    }
}