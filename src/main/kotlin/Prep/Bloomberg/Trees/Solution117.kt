package Prep.Bloomberg.Trees

class Solution117 {

    fun connect(root: Node?): Node? {
        if (root == null) return null

        fun connectLevel(left: Node?, right: Node?) {

            left?.next = right
            connectLevel(left?.left, left?.right)


        }
        connectLevel(root.left, root.right)
        return root
    }
}

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}