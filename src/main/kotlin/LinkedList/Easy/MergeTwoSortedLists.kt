fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    var f = list1
    var s = list2
    val dummy = ListNode(0)
    var current: ListNode? = dummy

    while (f != null && s != null) {
        if (f.data > s.data) {
            current?.next = ListNode(s.data)
            s = s.next
        } else {
            current?.next = ListNode(f.data)
            f = f.next
        }
        current = current?.next
    }

    while (f != null) {
        current?.next = ListNode(f.data)
        f = f.next
        current = current?.next
    }
    while (s != null) {
        current?.next = ListNode(s.data)
        s = s.next
        current = current?.next
    }

    return dummy.next
}
