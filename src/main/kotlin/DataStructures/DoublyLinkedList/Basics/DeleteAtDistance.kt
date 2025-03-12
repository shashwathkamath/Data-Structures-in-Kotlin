fun deleteNodeAtGivenDistance(head: DLLNode?, x: Int): DLLNode? {
    if (head == null) return null

    if (x == 0) {
        val newHead = head.next
        newHead?.prev = null
        return newHead
    }

    var current = head
    var count = 0

    while (current != null && count < x) {
        count++
        current = current.next
    }
    if (current == null) return head

    val next = current.next
    current.prev?.next = next
    if (next != null) {
        next.prev = current.prev
    }
    return head
}
