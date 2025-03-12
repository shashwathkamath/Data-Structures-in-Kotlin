fun <T> removeNthFromEnd(head: Node<T>?, n: Int): Node<T>? {
    // () 1 2 3 4 5 null
    // f  f f f f f f
    // s  s s s

    var dummy = Node(0 as T)
    dummy.next = head
    var fast: Node<T>? = dummy
    var slow: Node<T>? = dummy

    for (i in 0..n) {
        fast = fast?.next
    }

    while (fast != null) {
        fast = fast.next
        slow = slow?.next
    }
    slow?.next = slow?.next?.next
    return dummy.next
}
