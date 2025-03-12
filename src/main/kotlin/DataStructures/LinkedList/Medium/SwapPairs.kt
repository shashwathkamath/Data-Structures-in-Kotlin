fun swapPairs(head: ListNode?): ListNode? {
    val dummy: ListNode? = ListNode(0)
    dummy?.next = head
    var current = head
    val k = 2
    var prevGroupEnd = dummy
    while (current != null) {
        var groupStart: ListNode? = current
        var count = 0

        while (current != null && count < k) {
            current = current.next
            count++
        }

        if (count == k) {
            var subCurrent = groupStart
            var subPrev: ListNode? = null
            for (i in 0 until k) {
                val next = subCurrent?.next
                subCurrent?.next = subPrev
                subPrev = subCurrent
                subCurrent = next
            }
            prevGroupEnd?.next = subPrev
            groupStart?.next = current
            prevGroupEnd = groupStart
        }
    }

    return dummy?.next
}
