fun <T> detectCycle(head: Node<T>?): Node<T>? {
    if (head == null) return null
    val commonNode = getCommonNode(head)
    if (commonNode == null) return null

    var c1 = commonNode
    var c2 = commonNode

    while (c1 != c2) {
        c1 = c1?.next
        c2 = c2?.next
    }
    return c1
}

fun <T> getCommonNode(head: Node<T>?): Node<T>? {
    var slow: Node<T>? = head
    var fast: Node<T>? = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) return slow
    }

    return null
}
