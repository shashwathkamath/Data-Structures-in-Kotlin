package Prep.Bloomberg.Trees

class Solution116 {

    fun connect(root: Node?): Node? {
        if (root == null) return null

        fun connectLevel(left: Node?, right: Node?) {
            if (left == null || right == null) return
            left.next = right

            connectLevel(left.left, left.right)
            connectLevel(right.left, right.right)

            connectLevel(left.right, right.left)
        }

        connectLevel(root.left, root.right)
        return root
    }

    class Node(var `val`: Int) {
        var left: Node? = null
        var right: Node? = null
        var next: Node? = null
    }
}



