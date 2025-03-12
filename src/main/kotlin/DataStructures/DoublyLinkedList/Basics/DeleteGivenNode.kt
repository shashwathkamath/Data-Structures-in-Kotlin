fun deleteNodeWithGivenData(head: DLLNode?, data: Int): DLLNode? {
    if (head == null) return null
    if (head.`val` == data) {
        val newHead = head.next
        newHead?.prev = null
        return newHead
    }
    var current: DLLNode? = head
    while (current != null && current.`val` != data) {
        current = current.next
    }
    if (current == null) return head

    current.prev?.next = current.next
    if (current.next != null) {
        current.next?.prev = current.prev
    }

    return head
}
