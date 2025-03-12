fun insertAtEnd(tail: DLLNode?, data: Int): DLLNode? {
    var newNode: DLLNode? = DLLNode(data)

    if (tail != null) {
        newNode?.prev = tail
        tail.next = newNode
    }

    return newNode
}
