import LinkedList.Utils.ListNode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummy: ListNode? = ListNode(0)
    var c1 = l1
    var c2 = l2
    var c3: ListNode? = dummy
    var carry = 0

    while (c1 != null || c2 != null) {
        var sum = 0
        sum += (c1?.data ?: 0) + (c2?.data ?: 0) + carry
        carry = sum / 10
        sum = sum % 10
        c3?.next = ListNode(sum)
        c3 = c3?.next
        if (c1 != null) c1 = c1.next
        if (c2 != null) c2 = c2.next
    }

    if (carry != 0) {
        c3?.next = ListNode(carry)
    }

    return dummy?.next
}
