fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    val dummy: ListNode? = ListNode(0)
    dummy?.next = head
    var current: ListNode? = head
    var prevG: ListNode? = dummy
    // because its 1 based index
    var i = 1
    while (current != null && i < left) {
        prevG = current
        current = current.next
        i++
    }

    // reverse
    var subPrev: ListNode? = null
    i = 0

    while (current != null && i < right - left + 1) {
        val next = current.next
        current.next = subPrev
        subPrev = current
        current = next
        i++
    }
    prevG?.next?.next = current
    prevG?.next = subPrev

    return null
}
