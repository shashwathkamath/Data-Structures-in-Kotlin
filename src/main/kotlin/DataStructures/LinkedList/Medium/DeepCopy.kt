fun copyRandomList(head: RandomNode?): RandomNode? {
    if (head == null) return null

    var current = head

    // first create copies
    while (current != null) {
        val copy = RandomNode(current.data)
        copy.next = current.next
        current.next = copy
        current = copy.next
    }

    // setup random pointers
    current = head
    while (current != null) {
        current.next?.random = current.random?.next
        current = current.next?.next
    }

    // now get only copied list and remove references of old list head from new one.file
    val newHead = head.next
    var original = head
    var copy = newHead

    while (original != null) {
        original.next = original.next?.next
        copy?.next = copy?.next?.next
        original = original.next
        copy = copy?.next
    }

    return newHead
}
