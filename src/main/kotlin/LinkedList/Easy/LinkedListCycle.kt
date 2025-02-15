fun <T> hasCycle(head: Node<T>?): Boolean {
    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (fast == slow) {
            return true
        }
    }
    return false
}
