fun insertBeforeTheGivenNode(head: DLLNode?, node: DLLNode?, data: Int): DLLNode? {
    val newNode: DLLNode? = DLLNode(data)
    if (head == null) return null

    if (node === head) {
        newNode?.next = head
        newNode?.prev = null
        head.prev = newNode
        return newNode
    }

    newNode?.next = node
    newNode?.prev = node?.prev
    if (newNode?.prev != null) {
        node?.prev?.next = newNode
    }

    return head
}
