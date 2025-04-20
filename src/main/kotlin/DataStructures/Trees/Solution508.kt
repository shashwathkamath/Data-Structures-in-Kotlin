package DataStructures.Trees

class Solution508 {
    private var map = mutableMapOf<Int, Int>()
    private var maxFrequency = 0

    fun findFrequentTreeSum(root: TreeNode?): IntArray {
        helper(root)
        val maxFreq = map.values.maxOrNull()

        return if (maxFreq == 1) {
            map.keys.toIntArray()
        } else {
            map.filter { it.value == maxFreq }
                .map { it.key }
                .toIntArray()
        }
    }

    fun helper(root: TreeNode?): Int {
        if (root == null) return 0

        val left = helper(root.left)
        val right = helper(root.right)
        val totalSubTree = left + right + root.`val`
        map[totalSubTree] = map.getOrDefault(totalSubTree, 0) + 1
        return totalSubTree
    }
}