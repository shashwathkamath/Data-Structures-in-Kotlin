fun partition(head: ListNode?, x: Int): ListNode? {
    val lessHead = ListNode(0)
    var less: ListNode? = lessHead
    val greaterHead: ListNode? = ListNode(0)
    var greater = lessHead

    var current = head

    while (current != null) {
        if (current.data < x) {
            less?.next = current
            less = less?.next
        } else {
            greater.next = current
            greater = greater.next!!
        }
        current = current.next
    }
    greater.next = null
    less?.next = greaterHead?.next

    return lessHead.next
}
