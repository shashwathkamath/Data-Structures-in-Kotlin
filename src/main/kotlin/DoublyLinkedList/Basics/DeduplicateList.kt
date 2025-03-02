fun deduplicateList(head: DLLNode?): DLLNode? {
    if (head == null || head.next == null) return null
    var current = head
    while (current != null) {
        if (current.`val` == current.next?.`val`) {
            current.next = current.next?.next
            if (current.next != null) {
                current.next?.prev = current
            }
        } else {
            current = current.next
        }
    }

    return head
}
