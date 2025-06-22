package Prep.easy.LinkedList

import Prep.epam.ListNode

class Solution21 {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummy: ListNode? = ListNode(0)
        var c1 = list1
        var c2 = list2
        var c = dummy

        while (c1 != null && c2 != null) {
            when {
                c1.`val` < c2.`val` -> {
                    c?.next = ListNode(c1.`val`)
                    c1 = c1.next
                    c = c?.next
                }

                else -> {
                    c?.next = ListNode(c2.`val`)
                    c2 = c2.next
                    c = c?.next
                }
            }
        }
        while (c1 != null) {
            c?.next = ListNode(c1.`val`)
            c1 = c1.next
            c = c?.next
        }
        while (c2 != null) {
            c?.next = ListNode(c2.`val`)
            c2 = c2.next
            c = c?.next
        }

        return dummy?.next
    }
}