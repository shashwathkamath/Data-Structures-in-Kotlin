fun insert(head: DLLNode?, data: Int): DLLNode? {
    var newNode = DLLNode(data)
    if (head != null) {
        newNode.next = head
        head.prev = newNode
    }
    return newNode
}
