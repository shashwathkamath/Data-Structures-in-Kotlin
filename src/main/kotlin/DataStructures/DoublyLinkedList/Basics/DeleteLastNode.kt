fun deleteLastNode(tail: DLLNode?): DLLNode? {
    if (tail == null || tail.prev == null) return null
    // 1 2 3 <--tail
    val nextTail = tail.prev
    nextTail?.next = null
    return nextTail
}
