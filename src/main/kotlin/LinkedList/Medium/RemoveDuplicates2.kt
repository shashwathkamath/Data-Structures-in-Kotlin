fun deleteDuplicates(head: ListNode?): ListNode? {
    val dummy: ListNode? = ListNode(0)
    dummy?.next = head

    var prev: ListNode? = dummy
    var current = head

    while (current != null) {
        var hasDuplicate = false

        while (current != null && current.data == current.next?.data) {
            current = current.next
            hasDuplicate = true
        }
        if (hasDuplicate) {
            prev?.next = current
        } else {
            prev = prev?.next
        }
        current = current?.next
    }
    return dummy?.next
}
