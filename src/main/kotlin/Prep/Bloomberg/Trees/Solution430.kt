package Prep.Bloomberg.Trees


class Solution430 {

    fun flatten(root: Node?): Node? {
        if (root == null) return null
        var current = root

        while (current != null) {
            if (current.child == null) {
                current = current.next
                continue
            }
            var temp = current.child
            while (temp?.next != null) {
                temp = temp.next
            }
            temp?.next = current.next
            current.next?.prev = temp
            current.next = current.child
            current.child?.prev = current
            current.child = null
            current = current.next
        }
        return root
    }


    class Node(var `val`: Int) {
        var prev: Node? = null
        var next: Node? = null
        var child: Node? = null
    }
}

