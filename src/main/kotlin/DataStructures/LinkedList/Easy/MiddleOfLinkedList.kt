fun <T> middleNode(head: Node<T>?): Node<T>? {
    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    println("Slow pointer $slow")
    return slow
}
