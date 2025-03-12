fun <T> ReverseLinkedList(head: Node<T>?): Node<T>? {
    var prev: Node<T>? = null
    var current = head

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev
}
