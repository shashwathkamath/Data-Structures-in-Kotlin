fun insertAfterTheGivenNode(node: DLLNode?, data: Int) {
    if (node == null) return

    val newNode = DLLNode(data)
    newNode.next = node.next
    newNode.prev = node
    node.next = newNode
    if (node.next != null) {
        node.next?.prev = newNode
    }
}
