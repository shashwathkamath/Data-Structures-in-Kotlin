package DataStructures.Trees.BST

data class Node(
    var `val`: Int,
    var left: Node? = null,
    var right: Node? = null,
    var parent: Node? = null
)

class Solution510 {

    fun inorderSuccessor(node: Node?): Node? {
        if (node == null) return null
        if (node.right != null) {
            var current = node.right
            while (current?.left != null) {
                current = current.left
            }
            return current
        }

        var current = node
        while (current?.parent != null) {
            current = current.parent
        }
        return current?.parent
    }
}



