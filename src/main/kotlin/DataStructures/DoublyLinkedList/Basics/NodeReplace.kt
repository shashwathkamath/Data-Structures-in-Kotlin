fun nodePlacement(head: DLLNode?, tail: DLLNode?, data: Int): DLLNode? {
    var current: DLLNode? = head
    val newNode = DLLNode(data)
    if (head == null || data < head.`val`) {
        newNode.next = head
        head?.prev = newNode
        return newNode
    }
    while (current != null && current.`val` < data) {
        // 1 1
        current = current.next
    }

    if (current == null) {
        newNode.prev = tail
        tail?.next = newNode
        return head
    }

    newNode.next = current
    newNode.prev = current.prev
    if (current.prev != null) {
        current.prev?.next = newNode
    }
    current.prev = newNode

    return head
}
