package DataStructures.Trees.BT

import DataStructures.Trees.TreeNode
import java.util.*

fun interativePreorder(root: TreeNode?): List<Int> {
    val res = mutableListOf<Int>()
    if (root == null) return res

    val st = Stack<TreeNode>()
    var current = root

    while (current != null || st.isNotEmpty()) {

        while (current != null) {
            res.add(current.`val`)
            st.push(current)
            current = current.left
        }

        if (st.isNotEmpty()) {
            current = st.pop()
            current = current.right
        }
    }
    return res.toList()
}