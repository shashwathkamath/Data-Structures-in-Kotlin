fun cloneAList(head: DLLNode?): DLLNode? {
    if (head == null) return null

    val dummy: DLLNode? = DLLNode(0)
    var current = head
    var clonedCurrent: DLLNode? = dummy

    while (current != null) {
        val newNode = DLLNode(current.`val`)
        clonedCurrent?.next = newNode
        newNode.prev = clonedCurrent
        clonedCurrent = clonedCurrent?.next
        current = current.next
    }
    return dummy?.next
}
