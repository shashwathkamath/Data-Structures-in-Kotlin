fun <T> Length(head: Node<T>?): Int {
    if (head == null) return 0
    var current = head
    var count = 0

    while (current != null) {
        count++
        current = current.next
    }
    return count
}
