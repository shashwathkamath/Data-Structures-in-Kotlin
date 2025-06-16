package Prep

class Solution21 {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy: ListNode? = ListNode(0)
        var c1 = list1
        var c2 = list2
        var p = dummy

        while (c1 != null && c2 != null) {
            when {
                c1.`val` < c2.`val` -> {
                    p?.next = ListNode(c1.`val`)
                    c1 = c1.next
                    p = p?.next
                }

                else -> {
                    p?.next = ListNode(c2.`val`)
                    c2 = c2.next
                    p = p?.next
                }
            }
        }

        while (c1 != null) {
            p?.next = ListNode(c1.`val`)
            c1 = c1.next
            p = p?.next
        }
        while (c2 != null) {
            p?.next = ListNode(c2.`val`)
            c2 = c2.next
            p = p?.next
        }

        return dummy?.next
    }
}