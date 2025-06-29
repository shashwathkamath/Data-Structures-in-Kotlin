package Prep.medium.LinkedList

import Prep.epam.ListNode

class Solution2 {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        val dummy: ListNode? = ListNode(0)
        var p = dummy
        var c1 = l1
        var c2 = l2
        var carry = 0

        while (c1 != null || c2 != null) {
            val sum = (c1?.`val` ?: 0) + (c2?.`val` ?: 0) + carry
            p?.next = ListNode(sum % 10)
            p = p?.next
            carry = sum / 10

            c1?.next?.let { c1 = c1.next }
            c2?.next?.let { c2 = c2.next }
        }

        if (carry > 0) {
            p?.next = ListNode(carry)
        }

        return dummy?.next
    }
}