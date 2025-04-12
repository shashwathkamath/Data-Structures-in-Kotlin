import LinkedList.Utils.ListNode

fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head
    var current = head
    var prevGroupEnd: ListNode? = dummy

    while (current != null) {
        var groupStart = current
        var count = 0

        while (current != null && count < k) {
            current = current.next
            count++
        }

        if (count == k) {
            var subCurrent: ListNode? = groupStart
            var subPrev: ListNode? = null
            for (i in 0 until k) {
                val next = subCurrent?.next
                subCurrent?.next = subPrev
                subPrev = subCurrent
                subCurrent = next
            }
            prevGroupEnd?.next = subPrev
            groupStart.next = current
            prevGroupEnd = groupStart
        }
    }

    return dummy.next
}
