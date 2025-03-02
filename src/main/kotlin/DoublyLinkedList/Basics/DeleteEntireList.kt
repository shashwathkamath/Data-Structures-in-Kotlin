fun deleteEntireList(head: DLLNode?): DLLNode? {
    var current = head
    while (current != null) {
        val next = current.next
        current.next = null
        current.prev = null
        current = next
    }
    return null
}
