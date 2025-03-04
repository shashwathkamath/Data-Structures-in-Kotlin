fun relocateNode(head: DLLNode?, tail: DLLNode?): DLLNode? {
    if (head == null) return null
    if (head == tail) return head

    val newTail = tail?.prev
    newTail?.next = null

    tail?.prev = null
    tail?.next = head
    head.prev = tail
    return tail
}
