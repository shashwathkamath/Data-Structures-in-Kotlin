fun <T> printNodes(head: Node<T>?) {
    var current = head
    while (current?.next != null) {
        println(current.data)
    }
}
