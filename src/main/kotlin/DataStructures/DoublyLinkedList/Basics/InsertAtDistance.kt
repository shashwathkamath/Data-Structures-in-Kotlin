fun insertAtGivenDistance(head: DLLNode?, x: Int, data: Int): DLLNode? {
    if (head == null) return null
    var count = 0
    var current = head
    val newNode = DLLNode(data)
    if (x == 0) {
        newNode.next = head
        head.prev = newNode

        return newNode
    }

    while (current != null && count < x) {
        count++
        current = current.next
    }
    if (current == null) return head

    newNode.next = current
    newNode.prev = current?.prev
    current?.prev = newNode
    current?.prev?.next = newNode

    return head
}
